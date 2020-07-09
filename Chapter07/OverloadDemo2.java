package Chapter07;
// Применить автоматическое преобразование типов к перегрузке
class OverLoad2 {
    void test() {
        System.out.println("Пapaмeтpы отсутствуют");
    }

    // Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
    }

    // Перегружаемый метод, проверяющий наличие параметра типа douЫe
    void test(double a) {
        System.out.println("Bнyтpeннee преобразование при вызове" +
                            " test(double) a: " + a);
    }
}

class OverloadDemo2 {
    public static void main(String[] args) {
        OverLoad2 od = new OverLoad2();
        int i = 88;

        od.test();
        od.test(10, 20);
        od.test(i);         // вызывается вариант метода test(douЬle)
        od.test(123.45); // вызывается вариант метода test(douЬle)
    }
}
/* -----------------------------
Пapaмeтpы отсутствуют
a: 10, b: 20
Bнyтpeннee преобразование при вызове test(double) a: 88.0
Bнyтpeннee преобразование при вызове test(double) a: 123.45

Так, если вариант метода test ( int) не обнаружен, тип переменной i автоматически
продвигается в Java к типу douЫe, а затем вызывается вариант метода tеst(doulе).
Безусловно, если бы вариант метода tеst(int) был определен, то был бы вызван именно он.
Автоматическое преобразование типов в Java выполняется только в том случае, если
не обнаружено полное соответствие.
 */