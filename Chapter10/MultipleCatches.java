package Chapter10;

// Продемонстрировать применение нескольких операторов catch
class MultipleCatches {
    public static void main (String[] args) {
        try {
            int a = args.length;
            System.out.println("a = " + a);
            int b = 10 / a;
            int[] m = {1};
            m[10] = 99;
        } catch (ArithmeticException e) {
            System.out.println("ОШИБКА!!!\nДеление на нуль: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ОШИБКА!!!\nОшибка индексации за пределами массива: " + e);
        }
        System.out.println("\n//... код после блока операторов try/catch");
    }
}
/* ------------------------------------------------------
a = 0
ОШИБКА!!!
Деление на нуль: java.lang.ArithmeticException: / by zero

//... код после блока операторов try/catch
 */