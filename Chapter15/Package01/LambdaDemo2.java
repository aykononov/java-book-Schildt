package Chapter15.Package01;

// Продемонстрировать применение лямбда-выражения,
// принимающего один параметр
// Еще один функциональный интерфейс
interface NumericTest {
    boolean test(int n);
}

public class LambdaDemo2 {
    public static void main(String[] args) {
        // Лямбда-выражение, в котором проверяется,
        // является ли число четным
        NumericTest isEven = (n) -> (n % 2) == 0;

        if (isEven.test(10))
            System.out.println("Чиcлo 10 четное");
        if (!isEven.test(9))
            System.out.println("Чиcлo 9 нечетное");

        // А теперь воспользуемся лямбда-выражением,
        // в котором проверяется, является ли число
        // неотрицательным
        NumericTest isNonNeg = (n) -> n >= 0;

        if (isNonNeg.test(1))
            System.out.println("Чиcлo 1 неотрицательное");
        if (!isNonNeg.test(-1))
            System.out.println("Чиcлo -1 отрицательное");
    }
}

/* --------------------
Чиcлo 10 четное
Чиcлo 9 нечетное
Чиcлo 1 неотрицательное
Чиcлo -1 отрицательное
 */