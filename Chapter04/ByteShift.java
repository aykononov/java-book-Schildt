package Chapter04;

public class ByteShift {
    public static void main(String[] args) {
        System.out.println("Сдвиг влево значения типа byte.");
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Первоначальное значение a: " + a );
        System.out.println("i and b: " + i + " " + b);
    }
}
