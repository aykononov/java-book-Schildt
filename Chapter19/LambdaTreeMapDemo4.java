package Chapter19;
// Используем лямбда-выражение для предыдущего примера TreeMapDemo3
import java.util.*;

class LambdaTreeMapDemo4 {
    public static void main(String[] args) {
        // лямбда-выражение присваивается компаратору строк
        Comparator<String> cm = (aStr,bStr) -> {
             // найти индекс символа, с которого начинается фамилия
            int i = aStr.indexOf(' ');
            int j = bStr.indexOf(' ');
            return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
        };

        TreeMap<String,Double> tm = new TreeMap<>(
                cm.thenComparing((aStr,bStr) ->aStr.compareToIgnoreCase(bStr)) );

        // ввести элементы в хеш-отображение
        tm.put("Джoн Доу", new Double(3434.34));
        tm.put("Toм Смит", new Double(123.22));
        tm.put("Джейн Бейкер", new Double(1378.00));
        tm.put("Тод Холл", new Double(99.22));
        tm.put("Paльф Смит", new Double(-19.08));

        // получить множество записей из метода entrySet()
        Set<Map.Entry<String, Double>> set = tm.entrySet();

        // вывести элементы из множества
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет "Джона Доу"
        double balance = tm.get("Джoн Доу");
        tm.put("Джoн Доу", balance + 1000.00);

        System.out.println("Hoвый остаток на счете Джона Доу: " + tm.get("Джoн Доу"));
        System.out.println();

        // вывести множество записей
        for (Map.Entry<String, Double> me : set) {
            System.out.println(me.getKey() + ": " + me.getValue());
        }
    }
}
/* --------------------------------------
Джейн Бейкер: 1378.0
Джoн Доу: 3434.34
Paльф Смит: -19.08
Toм Смит: 123.22
Тод Холл: 99.22

Hoвый остаток на счете Джона Доу: 4434.34

Джейн Бейкер: 1378.0
Джoн Доу: 4434.34
Paльф Смит: -19.08
Toм Смит: 123.22
Тод Холл: 99.22
 */