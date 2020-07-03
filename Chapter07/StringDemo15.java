// Продемонстрировать применение массивов объектов типа String

package Chapter07;

public class StringDemo15 {
    public static void main(String[] args) {
        String str[] = {"один","два","три"};

        for (int i = 0; i < str.length; i++)
            System.out.println("str[" + i + "]: " + str[i]);
    }
}
/*
--------------------
str[0]: один
str[1]: два
str[2]: три
 */