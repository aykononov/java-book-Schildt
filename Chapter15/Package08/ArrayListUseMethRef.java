package Chapter15.Package08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Пример использования ссылки на метод, чтобы найти максимальное значение в коллекции ArrayList
class MyClass {
    private int val;

    MyClass(int val) {
        this.val = val;
    }

    int getVal() {
        return this.val;
    }
}

class ArrayListUseMethRef {
    // Метод compare(), совместимый с аналогичным методом,
    // определенным в интерфейсе Comparator<T>.
    static int compareMC(MyClass a, MyClass b) {
        return a.getVal() - b.getVal();
    }

    public static void main(String[] args) {
        // Объявляем коллекцию и заполняем
        ArrayList<MyClass> a1 = new ArrayList<MyClass>();
        a1.add(new MyClass(1));
        a1.add(new MyClass(2));
        a1.add(new MyClass(5));
        a1.add(new MyClass(4));
        a1.add(new MyClass(9));
        a1.add(new MyClass(7));

        // Найдем максимальное значение, используя метод compareMC()
        MyClass maxValOb = Collections.max(a1, ArrayListUseMethRef::compareMC);
        System.out.println("Maкcимaльнoe значение равно: " + maxValOb.getVal());
    }
}
/*
Обратите внимание на то, что в самом классе MyClass не определяется метод сравнения
и не реализуется интерфейс Comparator. Тем не менее максимальное значение в списке объектов
типа MyClass может быть получено в результате вызова метода max(), поскольку в классе ArrayListUseMethRef
определяется статический метод compareMC(), совместимый с методом compare(), определенным в интерфейсе Comparator.
Таким образом, отпадает необходимость явным образом реализовывать и создавать экземпляр интерфейса Comparator.
Вывод в консоль:
---------------------------
Maкcимaльнoe значение равно: 9
 */