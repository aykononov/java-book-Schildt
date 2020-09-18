package Chapter18.Package03;

class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup groupA = new ThreadGroup("Группа А");
        ThreadGroup groupB = new ThreadGroup("Группа В");

        NewThread ob1 = new NewThread("Один", groupA);
        NewThread ob2 = new NewThread("Два", groupA);
        NewThread ob3 = new NewThread("Три", groupB);
        NewThread ob4 = new NewThread("Четыре", groupB);
        System.out.println("\nВывод из метода list():");
        groupA.list();
        groupB.list();
        System.out.println();

        System.out.println("Прерывается Группа А ...");
        Thread[] tga = new Thread[groupA.activeCount()];
        groupA.enumerate(tga); // получить потоки исполнения из группы
        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).mysuspend(); // приостановить каждый поток исполнения
        }

        //  выполнение группы А приостанавливается на четыре секунды.
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage() + "\nГлaвный поток исполнения прерван.");
        }
        System.out.println("\nBoзoбнoвлeниe Группы А ...");
        for (int i = 0; i < tga.length; i++) {
            ((NewThread)tga[i]).myresume(); // возобновить все потоки исполнения в группе
        }

        // ожидать завершения потоков исполнения
        try {
            System.out.println("\nОжидание завершения потоков исполнения ...");
            ob1.join();
            ob2.join();
            ob3.join();
            ob4.join();
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nИсключение в главном потоке исполнения");
        }
        System.out.println("\nГлaвный поток исполнения завершен.");
    }
}

// Пример программы, где создаются две группы потоков исполнения - по два потока в каждой.
class NewThread extends Thread {
    private boolean suspendFlag;

    NewThread(String threadname, ThreadGroup tgOb) {
        super(tgOb, threadname);
        System.out.println("Новый поток: " + this);
        suspendFlag = false;
        start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(getName() + ": " + i);
                Thread.sleep(1000);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage() + "\nИсключение в " + getName());
        }
        System.out.println(getName() + " - завершается");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

/* -------------------------------------------
Новый поток: Thread[Один,5,Группа А]
Новый поток: Thread[Два,5,Группа А]
Новый поток: Thread[Три,5,Группа В]
Новый поток: Thread[Четыре,5,Группа В]

Вывод из метода list():
java.lang.ThreadGroup[name=Группа А,maxpri=10]
    Thread[Один,5,Группа А]
    Thread[Два,5,Группа А]
java.lang.ThreadGroup[name=Группа В,maxpri=10]
    Thread[Три,5,Группа В]
    Thread[Четыре,5,Группа В]

Прерывается Группа А ...
Один: 5
Три: 5
Четыре: 5
Два: 5
Четыре: 4
Три: 4
Четыре: 3
Три: 3
Четыре: 2
Три: 2

Boзoбнoвлeниe Группы А ...
Два: 4

Ожидание завершения потоков исполнения ...
Один: 4
Три: 1
Четыре: 1
Один: 3
Два: 3
Четыре - завершается
Три - завершается
Два: 2
Один: 2
Один: 1
Два: 1
Один - завершается
Два - завершается

Глaвный поток исполнения завершен.
 */