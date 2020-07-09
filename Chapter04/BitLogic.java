package Chapter04;
//Продемонстрировать применение поразрядных логических операций
public class BitLogic {
    public static void main(String[] args) {
        System.out.println("Применение поразрядных логических операций.");
        String[] binary = {"0000","0001","0010","0011","0100","0101","0111",
                           "1000","1001","1010","1011","1100","1101","1110","1111"};
        int a = 3; // 0 + 2 + 1, или 0011
        int b = 6; // 4 + 2 + 0, или 0110
        int c = a | b;
        int d = a & b;
        int e = a ^ b;
        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;
        System.out.println("a = " + binary[a]);
        System.out.println("b = " + binary[b]);
        System.out.println("a|b = " + binary[c]);
        System.out.println("a&b = " + binary[d]);
        System.out.println("a^b = " + binary[e]);
        System.out.println("~a&b | a&~b = " + binary[f]);
        System.out.println("~a = " + binary[g]);
    }
}

/*
--------------------
a = 0011
b = 0111
a|b = 1000
a&b = 0010
a^b = 0101
~a&b | a&~b = 0101
~a = 1101
 */