package Chapter18.Package01;

// Продемонстрировать применение методов isInfinite() и isNaN()

class InfNaN {
    public static void main(String[] args) {
        Double dob1 = Double.valueOf(1 / 0.);
        Double dob2 = Double.valueOf(0 / 0.);
        System.out.println(dob1 + ": " + dob1.isInfinite() + ", " + dob1.isNaN());
        System.out.println(dob2 + ": " + dob2.isInfinite() + ", " + dob2.isNaN());
    }
}
/* ------------------
Infinity: true, false
NaN: false, true
 */