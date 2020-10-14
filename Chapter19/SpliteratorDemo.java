package Chapter19;

import java.util.ArrayList;
import java.util.Spliterator;

// Продемонстрировать применение интерфеса Spliterator
public class SpliteratorDemo {
    public static void main(String[] args) {
        // создать списочный массив числовых значений типа double
        ArrayList<Double> vals = new ArrayList<Double>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);
        // вызвать метод tryAdvance() для вывода содержимого списочного массива vals
        System.out.print("Coдepжимoe списочного массива vals:\n");
        Spliterator<Double> splitr = vals.spliterator();
        while (splitr.tryAdvance((n) -> System.out.print(n + "  ")));

        // создать новый списочный массив, содержащий квадратные корни
        // числовых значений из списочного массива vals
        splitr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        // вызвать метод forEachRemaining() для вывода содержимого списочного массива sqrs
        System.out.print("\nCoдepжимoe списочного массива sqrs:\n");
        splitr = sqrs.spliterator();
        splitr.forEachRemaining((n) -> System.out.println(n));
    }
}
/* ----------------------------------------------
Coдepжимoe списочного массива vals:
1.0  2.0  3.0  4.0  5.0
Coдepжимoe списочного массива sqrs:
1.0
1.4142135623730951
1.7320508075688772
2.0
2.23606797749979
 */