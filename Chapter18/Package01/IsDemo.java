package Chapter18.Package01;

// Продемонстрировать применение некоторых методов типа Is

class IsDemo {
    public static void main(String[] args) {
        char[] chrs = {'a', 'b', '5', '?', 'A', ' '};
        for (int i = 0; i < chrs.length; i++) {
            if (Character.isDigit(chrs[i])) System.out.println(chrs[i] + " - цифра");
            if (Character.isAlphabetic(chrs[i])) System.out.println(chrs[i] + " - буква");
            if (Character.isWhitespace(chrs[i])) System.out.println(chrs[i] + " - пробел");
            if (Character.isUpperCase(chrs[i])) System.out.println(chrs[i] + " - заглавная буква");
            if (Character.isLowerCase(chrs[i])) System.out.println(chrs[i] + " - строчная буква");
        }
    }
}
/*
a - буква
a - строчная буква
b - буква
b - строчная буква
5 - цифра
A - буква
A - заглавная буква
  - пробел
 */