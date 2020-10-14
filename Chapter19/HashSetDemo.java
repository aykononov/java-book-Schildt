package Chapter19;

// Продемонстрировать применение класса HashSet

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // создать хеш-множество
        HashSet<String> hs = new HashSet<String>();
        System.out.println("Начальный размер связного списка: " + hs.size());
        System.out.println("Ввод элементов в связный список...");
        hs.add("C");
        hs.add("A");
        hs.add("B");
        hs.add("D");
        hs.add("E");
        System.out.println("Размер связного списка: " + hs.size());
        System.out.println("Coдepжимoe связного списка: " + hs);
    }
}
/* -----------------------------------------
Начальный размер связного списка: 0
Ввод элементов в связный список...
Размер связного списка: 5
Coдepжимoe связного списка: [A, B, C, D, E]
 */