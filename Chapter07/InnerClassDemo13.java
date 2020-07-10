package Chapter07;
// Определить внутренний класс в цикле for
class Outer13 {
    int outer_x = 100;

    void test() {
        for (int i = 0; i < 10; i++) {
            class Inner {
                void display() {
                    System.out.println("вывод outer_x = " + outer_x);
                }
            }
            Inner inner = new Inner();
            inner.display();
        }
    }
}

public class InnerClassDemo13 {
    public static void main(String[] args) {
        Outer13 outer13 = new Outer13();
        outer13.test();
    }
}

/* ----------------
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
вывод outer_x = 100
 */