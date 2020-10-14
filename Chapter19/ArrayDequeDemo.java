package Chapter19;

// Продемонстрировать применение класса ArrayDeque

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {
        // создать двухстороннюю очередь
        ArrayDeque<String> adq = new ArrayDeque<String>();
        // использовать класс ArrayDeque для организации стека
        System.out.println("Начальный очереди: " + adq.size());
        System.out.println("Ввод элементов...");
        adq.push("C");
        adq.push("B");
        adq.push("A");
        adq.add("D");
        adq.add("E");
        System.out.println("Размер очереди: " + adq.size());
        System.out.println("Coдepжимoe очереди: " + adq);
    }
}
/*
Начальный очереди: 0
Ввод элементов...
Размер очереди: 5
Coдepжимoe очереди: [A, B, C, D, E]
 */