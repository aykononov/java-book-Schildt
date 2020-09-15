package Chapter17.Package01;

// Переопределить метод toString() в классе Вох
class Box {
    double width;
    double height;
    double depth;

    Box(double w, double h, double d) {
        this.width = w;
        this.height = h;
        this.depth = d;
    }

    public String toString() {
        return "Размеры " + this.width + " на " + this.height + " на " + this.depth + ".";
    }
}
class ToStringDemo {
    public static void main(String[] args) {
        Box ob = new Box(10, 11, 12);
        // выполним сцепление символьной строки с объектом типа Вох
        String s = "Объект ob типа Box имеет: " + ob;

        System.out.println(ob);
        System.out.println(s);
    }
}
/* ---------------------------------------------------
Размеры 10.0 на 11.0 на 12.0.
Объект ob типа Box имеет: Размеры 10.0 на 11.0 на 12.0.
 */