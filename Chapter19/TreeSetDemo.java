package Chapter19;

import java.util.TreeSet;

// Продемонстрировать применение класса TreeSet
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        System.out.println("Начальный размер связного списка: " + ts.size());
        System.out.println("Ввод элементов в связный список...");
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("D");
        ts.add("E");
        System.out.println("Размер связного списка: " + ts.size());
        System.out.println("Coдepжимoe связного списка: " + ts);
    }
}
/* -----------------------------------------
Начальный размер связного списка: 0
Ввод элементов в связный список...
Размер связного списка: 5
Coдepжимoe связного списка: [A, B, C, D, E]
 */