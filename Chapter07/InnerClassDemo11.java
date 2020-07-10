
package Chapter07;
// Продемонстрировать применение внутреннего класса
class Outer {
    int outer_x = 100;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    // это внутренний класс
    class Inner {
        void display() {
            System.out.println("вывод: outer_x = " + outer_x);
        }
    }
}

public class InnerClassDemo11 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}

/* ---------------------
вывод: outer_x = 100

    В данной программе внутренний класс Inner определен в области действия
класса Outer. Поэтому любой код из класса Inner может непосредственно обращаться
к переменной outer_x. Метод экземпляра display() определен в классе Inner.
Этот метод выводит значение переменной outer_x в стандартный поток вывода.
В методе main() из класса InnerClassDemo создается экземпляр класса Outer и
вызывается его метод test().А в этом методе создается экземпляр класса Inner
и вызывается метод display().
    Следует иметь в виду, что экземпляр класса Inner может быть создан только
в контексте класса Outеr.
 */