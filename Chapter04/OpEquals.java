package Chapter04;
// Составные операции с присваиванием
public class OpEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        a += 5;
        b *= 4;
        c += a * b;
        c %= 6;
        System.out.println("Составные операции присваивания.");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
/* ----------------------------
Составные операции присваивания.
a = 6
b = 8
c = 3
 */