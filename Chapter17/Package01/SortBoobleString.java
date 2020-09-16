package Chapter17.Package01;

// Пузырьковая сортировка объектов типа String

import java.util.Arrays;

class SortBoobleString {
    // Исходный массив
    private static String[] strs = {"Now", "is", "the", "time", "for", "all",
                                    "good", "men", "to", "come", "to", "the",
                                    "aid", "of", "their", "country"};

    // Метод Пузырьковой сортировки строк с учетом регистра compareTo()
    private static String[] getSort(String[] str) {
        for (int i = 0; i < str.length; i++) {
            for (int j = i + 1; j < str.length; j++) {
                if (str[j].compareTo(str[i]) < 0) {
                    String k = str[i];
                    str[i] = str[j];
                    str[j] = k;
                }
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println("Исходный массив строк: " + Arrays.toString(strs));
        System.out.println("Отсортированный массив: " + Arrays.toString(getSort(strs)));
    }
}
/* ----------------------------------------------------------------------------------------------------------
Исходный массив строк: [Now, is, the, time, for, all, good, men, to, come, to, the, aid, of, their, country]
Отсортированный массив: [Now, aid, all, come, country, for, good, is, men, of, the, the, their, time, to, to]
 */