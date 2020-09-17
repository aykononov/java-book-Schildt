package Chapter18.Package02;

// Измерение времени выполнения программы
class ElapsedTime {
    public static void main(String[] args) {
        long start, end = 0;
        System.out.println("Измерение времени выполнения перебора от 0 до 100000000.");
        start = System.currentTimeMillis(); // начальный момент времени
        for (long i = 0; i < 100000000L; i++) {
            end = System.currentTimeMillis(); // конечный момент времени
        }
        System.out.println("Bpeмя выполнения перебора: " + (end - start));
    }
}
/* -----------------------------------------
Измерение времени выполнения перебора от 0 до 100000000.
Bpeмя выполнения перебора: 444
 */