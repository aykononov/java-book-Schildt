package Chapter10;

// Продемонстрировать применение оператора throw
class ThrowDemo {
    static void demoproc() {
        try {
            throw new NullPointerException("демонстрация");
        } catch (NullPointerException e) {
            System.out.println("Исключение перехвачено в теле метода demoproc();");
            throw e; // повторно сгенерировать исключение
        }
    }

    public static void main (String[] args) {
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Повторный перехват: " + e);
        }
    }
}
/* -------------------------------------------------------------
Исключение перехвачено в теле метода demoproc();
Повторный перехват: java.lang.NullPointerException: демонстрация
 */