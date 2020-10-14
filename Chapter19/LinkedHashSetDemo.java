package Chapter19;

import java.util.LinkedHashSet;

// Продемонстрировать применение класса LinkedHashset
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        System.out.println("Начальный размер связного списка: " + lhs.size());
        System.out.println("Ввод элементов в связный список...");
        lhs.add("C");
        lhs.add("A");
        lhs.add("B");
        lhs.add("D");
        lhs.add("E");
        System.out.println("Размер связного списка: " + lhs.size());
        System.out.println("Coдepжимoe связного списка: " + lhs);
    }
}
/* ----------------------------------------
Начальный размер связного списка: 0
Ввод элементов в связный список...
Размер связного списка: 5
Coдepжимoe связного списка: [C, A, B, D, E]

 */