package Chapter15.Package08;

// Пример применения ссылки на обобщенный метод, объявленный в необобщенном классе

//Функциональный интерфейс для обработки массива значений и возврата целочисленного результата
interface GenMyFunc<T> {
    int func(T[] vals, T v);
}
// В этом классе определяется метод countMatching(), возвращающий
// количество элементов в массиве, равных указанному значению.
// Метод countMatching() является обобщенным, тогда как класс MyArrayOps - необобщенный.
class MyArrayOps {
    static <T> int countMatching(T[] vals, T v) {
        int count = 0;
        for (int i = 0; i < vals.length; i++) {
            if (vals[i] == v) count++;
        }
        return count;
    }
}

class GenericMethodRefDemo {
    // В качестве первого параметра этого метода указывается функциональный интерфейс MyFunc,
    // а в качестве двух других параметров - массив и значение, причем оба типа Т.
    static <T> int myOp(GenMyFunc<T> f, T[] vals, T v) {
        return f.func(vals, v);
    }

    public static void main(String[] args) {
        Integer[] vals = {1, 2, 3, 4, 2, 3, 4, 4, 5};
        String[] strs = {"Один", "Два", "Три", "Два", "Четыре", "Три", "Два", "Один"};
        int count = myOp(MyArrayOps::<Integer>countMatching, vals, 4);
        System.out.println("Количество чисел (4) в массиве vals равно: " + count);
        count = myOp(MyArrayOps::<String>countMatching, strs, "Два");
        System.out.println("Количество значений (Два) в массиве strs равно: " + count);
    }
}
/* ----------------------------------------
Количество чисел (4) в массиве vals равно: 3
Количество значений (Два) в массиве strs равно: 3
 */