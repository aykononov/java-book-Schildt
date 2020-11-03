package Chapter19;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

// Применить итераторы вместе с классом Hashtable
class HashTableIterDemo {
    public static void main(String[] args) {
        Hashtable<String,Double> ht = new Hashtable<String, Double>();
        String str;
        Double balance;

        ht.put("Джoн Доу", new Double(3434.34));
        ht.put("Toм Смит", new Double(123.22));
        ht.put("Джейн Бейкер", new Double(1378.00));
        ht.put("Тод Холл", new Double(99.22));
        ht.put("Paльф Смит", new Double(-19.08));

        // Вывести все счета в хеш-таблице.
        // Сначала получить представление всех ключей в виде множества
        Set<String> set = ht.keySet();

        // получить итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + ht.get(str));
        }

        System.out.println();
        // внести сумму 1000 на счет "Джона Доу"
        balance = ht.get("Джoн Доу");
        ht.put("Джoн Доу", balance + 1000.00);

        System.out.println("Hoвый остаток на счете Джона Доу: " + ht.get("Джoн Доу"));
    }
}
/* ---------------------------------------
Paльф Смит: -19.08
Тод Холл: 99.22
Джoн Доу: 3434.34
Джейн Бейкер: 1378.0
Toм Смит: 123.22

Hoвый остаток на счете Джона Доу: 4434.34
 */