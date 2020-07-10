
package Chapter07;
// Простой пример рекурсии (вычисление Факториала)
class Factorial {
    // это рекурсивный метод
    int fact(int n) {
        int result;

        if(n == 1) return 1;
        result = fact(n - 1) * n;
        return result;
    }
}

public class Recursion05 {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        System.out.println("Факториал (3) = " + f.fact(3));
        System.out.println("Факториал (4) = " + f.fact(4));
        System.out.println("Факториал (5) = " + f.fact(5));
    }
}

/*
-------------------------
Факториал (3) = 6
Факториал (4) = 24
Факториал (5) = 120
 */