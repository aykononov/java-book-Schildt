package Chapter17.Package01;

// Продемонстрировать применение методов toUpperCase() и toLowerCase()

class ChangeCase {
    public static void main(String[] args) {
        String str = "Исходная строка";
        String upper = str.toUpperCase();
        String lower = str.toLowerCase();
        System.out.println(str + "-> преобразуем в Bерхний регистр: " + upper);
        System.out.println(str + "-> преобразуем в Нижний регистр: " + lower);
    }
}
/* --------------------------------------------------------------
Исходная строка-> преобразуем в Bерхний регистр: ИСХОДНАЯ СТРОКА
Исходная строка-> преобразуем в Нижний регистр: исходная строка
 */