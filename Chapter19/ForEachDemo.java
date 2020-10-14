package Chapter19;

// Продемонстрировать применение цикла ForEach для перебора коллекции

import java.util.ArrayList;

public class ForEachDemo {
    public static void main(String[] args) {
        // создать списочный массив для целых чисел
        ArrayList<Integer> vals = new ArrayList<Integer>();
        // ввести числовые значения в списочный массив
        vals.add(1);
        vals.add(2);
        vals.add(3);
        vals.add(4);
        vals.add(5);
        System.out.println("Исходное содержимое списочного массива vals: ");
        for (int v : vals) {
            System.out.print(v + " ");
        }
        // суммировать числовые значения в цикле for each
        int sum = 0;
        for (int v : vals) {
            sum += v;
        }
        System.out.println("\nCyммa числовых значений: " + sum);
    }
}
/* -----------------------------------------
Исходное содержимое списочного массива vals:
1 2 3 4 5
Cyммa числовых значений: 15
 */