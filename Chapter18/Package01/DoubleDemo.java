package Chapter18.Package01;

// Продемонстрировать применение класса Double

class DoubleDemo {
    public static void main(String[] args) {
        Double dob1 = Double.valueOf(3.14159);
        Double dob2 = Double.valueOf("314159E-5");
        System.out.println(dob1 + " = " + dob2 + " : " + dob1.equals(dob2));
    }
}
/* ---------------------
3.14159 = 3.14159 : true
 */