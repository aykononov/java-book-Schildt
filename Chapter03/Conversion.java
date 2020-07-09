package Chapter03;
// Продемонстрировать приведение типов
public class Conversion {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;
        System.out.println("\nПреобразование типа int в byte.");
        b = (byte) i;
        System.out.println("i , b : " + i + " , " + b);
        System.out.println("\nПреобразование типа double в int.");
        i = (int) d;
        System.out.println("d , i : " + d + " , " + i);
        System.out.println("\nПреобразование типа double в byte.");
        b = (byte) d;
        System.out.println("d , b : " + d + " , " + b);
    }
}
/*

Преобразование типа int в byte.
i , b : 257 , 1

Преобразование типа double в int.
d , i : 323.142 , 323

Преобразование типа double в byte.
d , b : 323.142 , 67

Process finished with exit code 0
 */