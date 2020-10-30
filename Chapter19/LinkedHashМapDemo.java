package Chapter19;

import java.lang.*;
import java.util.*;

// Продемонстрировать применение класса LinkedHashМap
class LinkedHashМapDemo {
    public static void main(String[] args) {
        // создать связный список элементов
        LinkedHashMap<String, Double> lhm = new LinkedHashMap<>();

        // ввести элементы в хеш-отображение
        lhm.put("Джoн Доу", new Double(3434.34));
        lhm.put("Toм Смит", new Double(123.22));
        lhm.put("Джейн Бейкер", new Double(1378.00));
        lhm.put("Тод Холл", new Double(99.22));
        lhm.put("Paльф Смит", new Double(-19.08));

        // получить множество записей из метода entrySet()
        Set<Map.Entry<String, Double>> set = lhm.entrySet();

        // вывод элементов получается в том же порядке, в каком они были введены !!!
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет "Джона Доу"
        double balance = lhm.get("Джoн Доу");
        lhm.put("Джoн Доу", balance + 1000.00);
        System.out.println("Hoвый остаток на счете Джона Доу: " + lhm.get("Джoн Доу"));
        System.out.println();

        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}
/* --------------------------------------
Джoн Доу: 3434.34
Toм Смит: 123.22
Джейн Бейкер: 1378.0
Тод Холл: 99.22
Paльф Смит: -19.08

Hoвый остаток на счете Джона Доу: 4434.34

Джoн Доу: 4434.34
Toм Смит: 123.22
Джейн Бейкер: 1378.0
Тод Холл: 99.22
Paльф Смит: -19.08
 */