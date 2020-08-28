package Chapter14.Package09;
// Использовать оператор instanceof в иерархии обобщенных классов
class Gen<T> {
    T ob;

    Gen(T o) {
        ob = o;
    }

    // возвратить объект оЬ
    T getOb() {
        return ob;
    }
}

// Подкласс, производный от класса Gen
class Gen2<T> extends Gen<T> {
    Gen2(T o) {
        super(o);
    }
}

// продемонстрировать последствия динамической
// идентификации типов в иерархии обобщенных классов
public class HierDemo3 {
    public static void main(String[] args) {
        // создать объект типа Gen для целых чисел
        Gen<Integer> iOb = new Gen<Integer>(88);

        // создать объект типа Gen2 для целых чисел
        Gen2<Integer> iOb2 = new Gen2<Integer>(99);

        // создать объект типа Gen2 для символьных строк
        Gen2<String> sOb2 = new Gen2<String>("Символьная строка");

        // проверить, является ли объект iOb2 какой-нибудь из форм класса Gen2
        if (iOb2 instanceof  Gen2<?>) {
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen2");
        }

        // проверить, является ли объект iOb2 какой-нибудь из форм класса Gen
        if (iOb2 instanceof Gen<?>) {
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gen");
        }

        // проверить, является ли sOb2 объектом класса Gen2
        if (sOb2 instanceof Gen2<?>) {
            System.out.println("Oбъeкт sOb2 является экземпляром класса Gen2");
        }

        // проверить, является ли sOb2 объектом класса Gen
        if (sOb2 instanceof Gen<?>) {
            System.out.println("Oбъeкт sOb2 является экземпляром класса Gen");
        }

        // проверить, является ли iOb экземпляром класса Gеn2, что совсем не так
        if (iOb instanceof Gen2<?>) {
            System.out.println("Oбъeкт iOb является экземпляром класса Gen2");
        }

        // проверить, является ли iOb экземпляром класса Gen, что так и есть
        if (iOb instanceof Gen<?>) {
            System.out.println("Oбъeкт iOb является экземпляром класса Gen");
        }

        //Следующий код не скомпилируется, так как сведения об обобщенном типе
        // отсутствуют во время выполнения
        // if(iOb2 instanceof Gen2<Integer>)
        // System.out.println("Oбъeкт iOb2 является экземпляром класса Gen2<Integer>");
        // ВАЖНО!!!
        // Во время выполнения всякие сведения об обобщенном типе отсутствуют. Таким образом, оператор
        // instanceof не может выяснить, является объект iОЬ2 экземпляром типа Gen2<Integer> или нет.
    }
}
/* -----------------------------------------
Oбъeкт iOb2 является экземпляром класса Gen2
Oбъeкт iOb2 является экземпляром класса Gen
Oбъeкт sOb2 является экземпляром класса Gen2
Oбъeкт sOb2 является экземпляром класса Gen
Oбъeкт iOb является экземпляром класса Gen
 */