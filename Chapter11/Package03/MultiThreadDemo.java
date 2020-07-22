package Chapter11.Package03;

// Создать несколько потоков исполнения
class NewThread implements Runnable {
    String name; // имя потока исполнения
    Thread t;

    NewThread(String threadname) {
        name = threadname;
        t    = new Thread(this, name);
        System.out.println("Новый поток: " + t);
        t.start(); // запустить поток на исполнение
    }

    // Точка входа в поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println(name + " прерван.");
        }
        System.out.println(name + " завершен.");
    }
}
class MultiThreadDemo {
    public static void main(String[] args) {
        new NewThread("Первый"); // запустить потоки на исполнение
        new NewThread("Второй");
        new NewThread("Третий");

        try {
            // ожидать завершения других потоков исполнения
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван.");
        }

        System.out.println("Глaвный поток завершен.");
    }
}
/* После запуска на исполнение все три дочерних потока совместно используют общие ресурсы ЦП.
Обратите внимание на вызов метода slеер(1ОООО) в методе main().
Это вынуждает главный поток перейти в состояние ожидания на 10 секунд и гарантирует его завершение последним.
----------------------------------
Новый поток: Thread[Первый,5,main]
Новый поток: Thread[Второй,5,main]
Новый поток: Thread[Третий,5,main]
Первый: 5
Третий: 5
Второй: 5
Первый: 4
Второй: 4
Третий: 4
Первый: 3
Второй: 3
Третий: 3
Второй: 2
Первый: 2
Третий: 2
Третий: 1
Второй: 1
Первый: 1
Третий завершен.
Первый завершен.
Второй завершен.
Глaвный поток завершен.
 */