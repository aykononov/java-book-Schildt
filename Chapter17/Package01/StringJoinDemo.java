package Chapter17.Package01;

// Продемонстрировать применение метода join(), определенного в классе String
class StringJoinDemo {
    public static void main(String[] args) {
       String result = String.join(", ", "Alpha", "Beta", "Gamma");
       System.out.println(result);
    }
}
/* ---------------
Alpha, Beta, Gamma
 */