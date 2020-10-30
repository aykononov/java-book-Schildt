package Chapter19;
// Использовать специальный компаратор
import java.util.*;

// Компаратор для сравнения символьных строк в обратном порядке
class MyComp implements Comparator<String> {
    public int compare(String a, String b) {
        String aStr = a;
        String bStr = b;
        // выполнить сравнение в обратном порядке
        return bStr.compareTo(aStr);
    }
    // переопределять метод equals() не требуется
}

class CompDemo {
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");
        // вывести элементы из древовидного множества
        for(String element : ts) {
            System.out.print(element + " ");
        }
    }
}
/*В теле метода compare() для объекта типа String вызывается метод compareTo(),
сравнивающий две символьные строки. Но метод compareTo() вызывается для строкового объекта bStr, а не aStr.
Благодаря этому результат сравнения получается обратным.
--------------------------------------------------------
F E D C B A
 */