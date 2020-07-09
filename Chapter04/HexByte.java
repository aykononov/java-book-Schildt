package Chapter04;
// Маскирование двоичных разрядов расширения знака
public class HexByte {
    public static void main(String[] args) {
        System.out.println("Маскирование двоичных разрядов расширения знака.");
        char[] hex = {'0','1','2','3','4','5','6','7',
                      '8','9','a','b','c','d','e','f'};
        byte b = (byte) 0xf1;
        System.out.println("b = 0x" + hex[(b >> 4) & 0x0f] + hex[b & 0x0f]);
    }
}
