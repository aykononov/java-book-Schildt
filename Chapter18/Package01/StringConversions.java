package Chapter18.Package01;

/* Преобразовать целое число в двоичную,
   шестнадцатеричную и восьмеричную строковую форму
*/
class StringConversions {
    public static void main(String[] args) {
        int num = 19648;
        System.out.println("Число " + num + " в двоичной форме: " + Integer.toBinaryString(num));
        System.out.println("Число " + num + " в шестнадцатеричной форме: " + Integer.toHexString(num));
        System.out.println("Число " + num + " в восьмеричной форме: " + Integer.toOctalString(num));
    }
}
/* ------------------------------------------
Число 19648 в двоичной форме: 100110011000000
Число 19648 в шестнадцатеричной форме: 4cc0
Число 19648 в восьмеричной форме: 46300
 */