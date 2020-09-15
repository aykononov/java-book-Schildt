package Chapter17.Package01;

// Создать символьную строку из подмножества массива символов
class SubStringCons {
    public static void main(String[] args) {
        byte[] ascii = {65, 66, 67, 68, 69, 70};
        String s1 = new String(ascii);
        System.out.println(s1 + " - длина символьной строки: " + s1.length());

        // 2 - начальный_индекс, 3 - количество_символов
        String s2 = new String(ascii, 2, 3);
        System.out.println(s2 + " - длина символьной строки: " + s2.length());

        System.out.println("abcd - длина символьной строки: " + "abcd".length());
    }
}
/* ------------------------------
ABCDEF - длина символьной строки: 6
CDE - длина символьной строки: 3
abcd - длина символьной строки: 4

 */