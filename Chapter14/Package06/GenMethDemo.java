package Chapter14.Package06;
// Продемонстрировать простой обобщенный метод
class GenMethDemo {
    // определить, содержится ли объект в массиве
    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // применить метод isIn() для целых чисел
        Integer[] nums = {1, 2, 3, 4, 5};
        if (isIn(2, nums))
            System.out.println("Чиcлo 2 содержится в массиве nums");
        if (!isIn(7, nums))
            System.out.println("Чиcлo 7 отсутствуете в массиве nums");

        // применить метод isIn() для символьных строк
        String[] strs = {"один", "два", "три", "четыре", "пять"};
        if (isIn("два", strs))
            System.out.println("Строка (два) содержится в массиве strs");
        if (!isIn("семь", strs))
            System.out.println("Строка (семь) отсутствует в массиве strs");
    }
}
/* -------------------------------------
Чиcлo 2 содержится в массиве nums
Чиcлo 7 отсутствуете в массиве nums
Строка (два) содержится в массиве strs
Строка (семь) отсутствует в массиве strs
 */