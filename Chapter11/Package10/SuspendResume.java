package Chapter11.Package10;

import java.util.SortedMap;

// Пример приостановки и возобновления исполнения потока
class NewThread implements Runnable {
    String name; //имя потока исполнения
    Thread thrd;
    Boolean suspendFlag;

    NewThread(String thrdname) {
        name = thrdname;
        thrd = new Thread(this, name);
        System.out.println("Hoвый поток: " + thrd);
        suspendFlag = false;
        thrd.start(); // запустить поток исполнения
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(200);
                synchronized (this) {
                    while (suspendFlag) {
                        wait();
                    }
                }
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван");
        }
        System.out.println(name + " завершен");
    }

    synchronized void mysuspend() {
        suspendFlag = true;
    }

    synchronized void myresume() {
        suspendFlag = false;
        notify();
    }
}

class SuspendResume {
    public static void main(String[] args) {
        NewThread obj1 = new NewThread("Один");
        NewThread obj2 = new NewThread("Два");

        try {

            Thread.sleep(1000);
            obj1.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Один");

            Thread.sleep(1000);
            obj1.myresume();
            System.out.println("Boзoбнoвлeниe потока Один");

            Thread.sleep(1000);
            obj2.mysuspend();
            System.out.println("Пpиocтaнoвкa потока Два");

            Thread.sleep(1000);
            obj2.myresume();
            System.out.println("Boзoбнoвлeниe потока Два");
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }

        // ожидать завершения потоков исполнения
        try {
            System.out.println("Oжидaниe завершения потоков");
            obj1.thrd.join();
            obj2.thrd.join();
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван");
        }
        System.out.println("Глaвный поток завершен");
    }
}
/* -----------------------------
Hoвый поток: Thread[Один,5,main]
Hoвый поток: Thread[Два,5,main]
Один: 5
Два: 5
Два: 4
Один: 4
Два: 3
Один: 3
Два: 2
Один: 2
Два: 1
Один: 1
Пpиocтaнoвкa потока Один
Два завершен
Boзoбнoвлeниe потока Один
Один завершен
Пpиocтaнoвкa потока Два
Boзoбнoвлeниe потока Два
Oжидaниe завершения потоков
Глaвный поток завершен
 */