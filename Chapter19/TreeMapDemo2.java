package Chapter19;

//Использовать компаратор для сортировки счетов по фамилиям вкладчиков

import java.util.*;

// сравнить последние слова в обеих символьных строках
class TComp implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j, k;
        // найти индекс символа, с которого начинается фамилия
        i = aStr.indexOf(' ');
        j = bStr.indexOf(' ');
        k = aStr.substring(i).compareTo(bStr.substring(j));

        //Фамилии совпадают, проверить имя и фамилию полностью
        if (k == 0) {
            return aStr.compareTo(bStr);
        } else {
            return k;
        }
        // переопределять метод equals() не требуется
    }
}

class TreeMapDemo2 {
    public static void main(String[] args) {
        // создать древовидное отображение
        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

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
/* Компаратор типа TComp сравнивает две символьные строки, содержащие имя и фамилию.
Сначала он сравнивает фамилии. Для этого осуществляется поиск позиции последнего пробела в каждой строке
с последующим сравнением подстроки, начинающейся с этой позиции. Если фамилии одинаковы, то сравниваются имена.
В итоге получается древовидное отображение, отсортированное по фамилиям вкладчиков, а в пределах одинаковых фамилий - по именам.

----------------------------------------
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