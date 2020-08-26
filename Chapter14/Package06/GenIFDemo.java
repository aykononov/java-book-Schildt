package Chapter14.Package06;
// Пример применения обобщенного интерфейса

// Обобщенный интерфейс MinMax для определения минимального и максимального значений
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}

// Реализовать обобщенный интерфейс MinMax
class ClassMinMax<T extends Comparable<T>> implements MinMax<T> {
    T[] vals;

    ClassMinMax(T[] o) {
        vals = o;
    }

    // Метод возвращает минимальное значение из массива vals
    public T min() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) < 0) {
                v = vals[i];
            }
        }

        return v;
    }

    // Метод возвращает максимальное значение из массива vals
    public T max() {
        T v = vals[0];

        for (int i = 0; i < vals.length; i++) {
            if (vals[i].compareTo(v) > 0) {
                v = vals[i];
            }
        }

        return v;
    }
}

class GenIFDemo {
    public static void main(String[] args) {
        Integer[] inums = {3, 2, 6, 1, 8};
        Character[] chrs = {'b', 'r', 'p', 'w', 'k'};

        ClassMinMax iOb = new ClassMinMax<Integer>(inums);
        ClassMinMax cOb = new ClassMinMax<Character>(chrs);

        System.out.println("Maкcимaльнoe значение в массиве inums: " + iOb.max());
        System.out.println("Mинимaльнoe значение в массиве inums: " + iOb.min());

        System.out.println("Maкcимaльнoe значение в массиве chrs: " + cOb.max());
        System.out.println("Mинимaльнoe значение в массиве chrs: " + cOb.min());
    }
}
/* -------------------------------------
Maкcимaльнoe значение в массиве inums: 8
Mинимaльнoe значение в массиве inums: 1
Maкcимaльнoe значение в массиве chrs: w
Mинимaльнoe значение в массиве chrs: b
 */