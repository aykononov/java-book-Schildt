package Chapter15.Package02;
// Развернуть строку в обратном порядке (используя Лямбда-выражение)
interface StringFunc {
    String getReversal(String str);
}

class StringReversalLambda {
    public static void main(String[] args) {
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        System.out.println("Строка в обратном порядке : " + reverse.getReversal("Строка"));
    }
}
/* -------------------------------
Строка в обратном порядке : акортС
 */