package Chapter11.Package01;

// Создать второй поток исполнения
class NewThread implements Runnable {
    Thread t;

    NewThread() {

        // Cоздать новый, второй поток исполнения !!!
        t = new Thread(this, "Демонстрационный поток");

        System.out.println("Дoчepний поток создан: " + t);
        t.start(); // запустить поток исполнения
    }

    // Точка входа во второй поток исполнения
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Дoчepний поток: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("Дoчepний поток прерван.");
        }
        System.out.println("Дoчepний поток завершен.");
    }
}

class ThreadDemo {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвный поток: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван.");
        }
        System.out.println("Глaвный поток завершен.");
    }
}
/* ---------------------------------------------------------
Дoчepний поток создан: Thread[Демонстрационный поток,5,main]
Глaвный поток: 5
Дoчepний поток: 5
Дoчepний поток: 4
Глaвный поток: 4
Дoчepний поток: 3
Дoчepний поток: 2
Глaвный поток: 3
Дoчepний поток: 1
Дoчepний поток завершен.
Глaвный поток: 2
Глaвный поток: 1
Глaвный поток завершен.
 */