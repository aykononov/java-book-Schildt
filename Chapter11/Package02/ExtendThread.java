package Chapter11.Package02;

// Создать второй поток исполнения, расширив класс Thread
class NewThread extends Thread {
    NewThread() {
        // создать новый поток исполнения
        super("Демонстрационный поток");
        System.out.println("Дoчepний поток: " + this);
        start(); // запустить поток на исполнение
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

class ExtendThread {
    public static void main(String[] args) {
        new NewThread(); // создать новый поток исполнения

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Глaвный поток: \t" + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Глaвный поток прерван.");
        }

        System.out.println("Глaвный поток завершен.");
    }
}
/*
Эта версия программы выводит такой же результат, как и предыдущая ее версия ThreadDemo.java.
Дочерний поток исполнения создается при конструировании объекта класса NewThread, наследующего от класса Thread.
Обратите внимание на метод super() в классе NewThread. Он вызывает конструктор Thread(), общая форма которого приведена ниже,
где параметр имя_потока обозначает имя порождаемого потока исполнения.
puЬlic Thread(String имя_потока)
--------------------------------------------------
Дoчepний поток: Thread[Демонстрационный поток,5,main]
Глaвный поток: 	5
Дoчepний поток: 5
Дoчepний поток: 4
Глaвный поток: 	4
Дoчepний поток: 3
Дoчepний поток: 2
Дoчepний поток: 1
Глaвный поток: 	3
Дoчepний поток завершен.
Глaвный поток: 	2
Глaвный поток: 	1
Глaвный поток завершен.
 */
