package Chapter11.Package09;

// Пример взаимной блокировки
class A {
    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод A.foo()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс A прерван");
        }
        System.out.println(name + "пытается вызвать метод B.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("B методе A.last()");
    }
}

class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + " вошел в метод B.bar()");

        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Класс B прерван");
        }
        System.out.println(name + "пытается вызвать метод A.last()");
        a.last();
    }

    synchronized void last() {
        System.out.println("B методе B.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();

    Deadlock() {
        Thread.currentThread().setName("Главный поток");
        Thread thr = new Thread(this, "Соперничающий поток");
        thr.start();

        // получить блокировку для объекта "а" в данном потоке исполнения
        a.foo(b);
        System.out.println("Haзaд в главный поток");
    }

    public void run() {
        //получить блокировку для объекта "b" в другом потоке исполнения
        b.bar(a);
        System.out.println("Назад в другой поток");
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}
/* -----------------------------------------------
Главный поток вошел в метод A.foo()
Соперничающий поток вошел в метод B.bar()
Соперничающий потокпытается вызвать метод A.last()
Главный потокпытается вызвать метод B.last()
...
 */