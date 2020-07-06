package Chapter08;
// Динамическая диспетчеризация методов (стр. 239 - 240)
class A08 {
    void callme() {
        System.out.println("Метод callme() из класса A");
    }
}
class B08 extends A08 {
    // переопределить метод callme()
    void callme() {
        System.out.println("Метод callme() из класса B");
    }
}
class C08 extends A08 {
    // переопределить метод callme()
    void callme() {
        System.out.println("Метод callme() из класса C");
    }
}
class DynamicMethodDispatching09 {
    public static void main(String[] args) {
        A08 obA = new A08(); // объект класса A
        B08 obB = new B08(); // объект класса B
        C08 obC = new C08(); // объект класса C

        A08 ref;   // получить ссылку на объект типа А

        ref = obA;
        ref.callme(); // вызвать вариант метода callme(), определенный в классе А

        ref = obB;
        ref.callme(); // вызвать вариант метода callme(), определенный в классе B

        ref = obC;
        ref.callme(); // вызвать вариант метода callme(), определенный в классе C
    }
}
/* -----------------------
Метод callme() из класса A
Метод callme() из класса B
Метод callme() из класса C
 */