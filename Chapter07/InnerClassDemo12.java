package Chapter07;

// Эта программа не подлежит компиляции !!!
class Outer12 {
    int outer_x = 100;

    void test() {
        Inner12 inner = new Inner12();
        inner.display();
    }
    // это внутренний класс
    class Inner12 {
        int y = 10; // у - локальная переменная класса Inner

        void display() {
            System.out.println("вывод outer_x = " + outer_x);
        }
    }

    void show() {
        System.out.println('y'); // !!! ошибка, здесь переменная у недоступна !!!
    }
}

public class InnerClassDemo12 {
    public static void main(String[] args) {
        Outer12 outer12 = new Outer12();
        outer12.test();
    }
}
