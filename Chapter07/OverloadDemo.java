package Chapter07;
// Продемонстрировать перегрузку методов
class Overload {
    void test() {
        System.out.println("Параметры отсутствуют.");
    }

    // Перегружаемый метод, проверяющий наличие одного целочисленного параметра
    void test(int a) {
        System.out.println("a: " + a);
    }

    // Перегружаемый метод, проверяющий наличие двух целочисленных параметров
    void test(int a, int b) {
        System.out.println("a: " + a + ", b: " + b);
    }

    // Перегружаемый метод, проверяющий наличие параметра типа douЫe
    double test(double a) {
        System.out.println("double a: " + a);
        return a * a;
    }
}

 class OverloadDemo {
    public static void main (String[] args) {
        Overload od = new Overload ();
        double result;

        // вызвать все варианты метода test()
        od.test();
        od.test(10);
        od.test(10, 20);
        result = od.test(123.45);
        System.out.println("Результат вызова ob.test(123.45): " + result);
    }
 }

 /*  ------------------------------
 Параметры отсутствуют.
a: 10
a: 10, b: 20
double a: 123.45
Результат вызова ob.test(123.45): 15239.9025
  */