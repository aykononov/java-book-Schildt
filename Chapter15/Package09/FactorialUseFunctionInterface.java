package Chapter15.Package09;

// Определение ФАКТОРИАЛА используя предопределенный функциональный интерфейс

import java.util.function.Function;

class FactorialUseFunctionInterface {
    public static void main(String[] args) {
        // Это блочное лямбда-выражение вычисляет ФАКТОРИАЛ целочисленного значения.
        // Для этой цели используется ФУНКЦИОНАЛЬНЫЙ интерфейс Function
        Function<Integer, Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n ; i++) {
                result = i * result;
            }
            return result;
        };
        System.out.println("Факториал числа (3) равен: " + factorial.apply(3));
        System.out.println("Факториал числа (5) равен: " + factorial.apply(5));
    }
}
/* ---------------------------
Факториал числа (3) равен: 6
Факториал числа (5) равен: 120
 */