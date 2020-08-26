package Chapter14.Package06;
//Использовать обобщенный конструктор
class GenCons {
    private double val;

    <T extends Number> GenCons(T val) {
        this.val = val.doubleValue();
    }

    void showval() {
        System.out.println("val: " + this.val);
    }
}

// В конструкторе GenCons() задается параметр обобщенного типа,
// который может быть производным от класса Number, поэтому конструктор GenCons()
// можно вызывать с любым числовым типом, включая Integer, Float или Double.

class GenConsDemo {
    public static void main(String[] args) {
        GenCons iOb = new GenCons(10);
        GenCons dOb = new GenCons(10.2);
        GenCons fOb = new GenCons(12.3F);

        iOb.showval();
        dOb.showval();
        fOb.showval();
    }
}
/* --------------------
val: 10.0
val: 10.2
val: 12.300000190734863
 */