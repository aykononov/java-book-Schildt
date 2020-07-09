package Chapter04;
// Операция деления по модулю% возвращает остаток от деления
public class Modulus {
    public static void main(String[] args) {
        System.out.println("Операция деления по модулю % .");
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10); // остаток от деления 42/10
        System.out.println("y mod 10 = " + y % 10); // остаток от деления 42.25/10
    }
}
/*
------------------
x mod 10 = 2
y mod 10 = 2.25
 */