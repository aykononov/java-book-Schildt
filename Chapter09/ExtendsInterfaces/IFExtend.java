package Chapter09.ExtendsInterfaces;
// Пример расширения интерфейсов

// Один интерфейс может расширять другой
interface A {
    void meth1();
    void meth2();
}

// Интефрейс B включает в себя все методы из A и добавляет свой
interface B extends A {
    void meth3();
}

// Класс реализует все методы из A и B
class MyClass implements B {
    public void meth1() {
        System.out.println("Реализация метода meth1");
    }

    public void meth2() {
        System.out.println("Реализация метода meth2");
    }

    public void meth3() {
        System.out.println("Реализация метода meth3");
    }
}
class IFExtend {
    public static void main(String[] args) {
        MyClass ob = new MyClass();

        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
/* --------------------
Реализация метода meth1
Реализация метода meth2
Реализация метода meth3
 */