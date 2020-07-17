package Chapter10;

// Пример обработки исключения
class Exc2 {
    public static void main(String[] args) {
        int d, a;

        try { // проконтролировать блок кода
            d = 0;
            a = 10 / d;
            System.out.println("Это не будет выведено!!!");
        } catch (ArithmeticException e) {
            // перехватываем ошибку и выводим сообщение с описанием ошибки
            System.out.println("ОШИБКА!!!\nДеление на нуль вызвало исключение:\n" + e);
        }

        System.out.println("\n//... код после оператора catch");
    }
}
/* -------------------------------------
ОШИБКА!!!
Деление на нуль вызвало исключение:
java.lang.ArithmeticException: / by zero

//... код после оператора catch
 */