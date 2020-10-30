package Chapter19;
// Использовать метод thenComparing() для сортировки счетов вкладчиков сначала по фамилии, а затем по имени
import java.util.*;

// Компаратор, сравнивающий фамилии вкладчиков
class CompLastName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        int i, j;
        // найти индекс символа, с которого начинается фамилия
        i = aStr.indexOf(' ');
        j = bStr.indexOf(' ');
        return aStr.substring(i).compareToIgnoreCase(bStr.substring(j));
    }
}

// отсортировать счета вкладчиков по Ф.И.О., если фамилии одинаковы
class CompThenByFirstName implements Comparator<String> {
    public int compare(String aStr, String bStr) {
        return aStr.compareToIgnoreCase(bStr);
    }
}

class TreeMapDemo3 {
    public static void main(String[] args) {
        // использовать метод thenComparing() для создания
        // компаратора, сравнивающего сначала фамилии, а
        // затем Ф.И.О. вкладчиков, если фамилии одинаковы
        CompLastName compLN = new CompLastName();
        Comparator<String> compLastThenFirst =
                compLN.thenComparing(new CompThenByFirstName());

        // создать древовидное отображение
        TreeMap<String, Double> tm =
                new TreeMap<String, Double>(compLastThenFirst);

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
/* CompLastNames этот компаратор сравнивает только фамилии вкладчиков, тогда
как второй компаратор типа CompThenByFirstName - Ф.И.О. вкладчиков, начиная с имени.
Ниже показано, каким образом создаются оба эти компаратора.

    CompLastNames compLN = new CompLastNames();
    Comparator<String> compLastThenFirst =
        compLN.thenComparing(new CompThenByFirstName());

Здесь первый компаратор присваивается переменной compLN в виде экземпляра класса CompLastNames.
Для него вызывается метод thenComparing(), которому в качестве параметра передается экземпляр класса CompThenByFirstName.
Полученный результат присваивается переменной compLastThenFirst. Этот второй компаратор используется для построения
древовидного множества типа TreeMap, как показано ниже.

    TreeMap<String, Double> tm = new TreeMap<String, Double>(compLastThenFirst);

Теперь сортировка счетов вкладчиков выполняется по Ф.И.О" если их фамилии оказываются одинаковыми.
Это означает, что имена вкладчиков упорядочиваются по фамилиям, а в пределах одинаковых фамилий - по именам.

-----------------------------------------------------------------------------------------------------------
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