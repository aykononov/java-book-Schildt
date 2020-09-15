package Chapter17.Package01;

// Пример демонстрирует применение метода getChars()
class GetCharsDemo {
    public static void main(String[] args) {
        String str = "Это демонстрационная строка.";
        int startStr = 4;
        int endStr = 8;
        char[] buf = new char[endStr - startStr];
        str.getChars(startStr, endStr, buf, 0);
        System.out.println(str);
        System.out.println(buf);
    }
}
/* -------------------------
Это демонстрационная строка.
демо
 */