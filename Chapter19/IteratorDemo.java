package Chapter19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratorDemo {
    public static void main(String[] args) {
        // создать списочный массив
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Начальный размер списочного массива: " + al.size());
        System.out.println("Ввод элементов в списочный массив...");
        al.add("C");
        al.add("A");
        al.add("B");
        al.add("D");
        al.add("E");
        System.out.println("Размер списочного массива: " + al.size());
        System.out.println("Coдepжимoe списочного массива: " + al);

        // использовать итераторы для вывода содержимого списочного массива al
        System.out.println("Исходное содержимое списочного массива al: ");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nвидоизменяем перебираемые объекты...");
        ListIterator<String> litr = al.listIterator();
        while (litr.hasNext()) {
            litr.set(litr.next() + "+");
        }
        System.out.println("Исходное видоизмененного списочного массива al: ");
        itr = al.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nИзмeнeнный в обратном порядке список: ");
        while (litr.hasPrevious()) {
            System.out.print(litr.previous() + " ");
        }
    }
}
/* Обратите особое внимание на вывод списка в обратном порядке.
   После видоизменения списка итератор litr указывает на конец списка.
----------------------------------------------------------------------
Начальный размер списочного массива: 0
Ввод элементов в списочный массив...
Размер списочного массива: 5
Coдepжимoe списочного массива: [C, A, B, D, E]
Исходное содержимое списочного массива al:
C A B D E
видоизменяем перебираемые объекты...
Исходное видоизмененного списочного массива al:
C+ A+ B+ D+ E+
Измeнeнный в обратном порядке список:
E+ D+ B+ A+ C+
 */