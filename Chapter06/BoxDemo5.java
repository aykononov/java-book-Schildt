package Chapter06;
// Перегрузка методов
class Box5 {
    double width;
    double height;
    double depth;

    // конструктор, используемый, когда указываются все размеры
    Box5 (double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    // конструктор, используемый, когда ни один из размеров не указан
    Box5 () {
    // значение -1 используется для неинициализированного параллелепипеда
        width  = -1;
        height = -1;
        depth  = -1;
    }

    // конструктор, используемый при создании куба
    Box5 (double len) {
        width = height = depth = len;
    }

    // иетод расчета и вывода объема
    double volume () {
        return width * height * depth;
    }
}


public class BoxDemo5 {
    public static void main (String[] args) {
        Box5 mybox5 = new Box5(10, 20, 15);
        Box5 mybox6 = new Box5();
        Box5 mybox7 = new Box5(7);

        System.out.println("Объем (mybox5): " + mybox5.volume());
        System.out.println("Объем (mybox6): " + mybox6.volume());
        System.out.println("Объем (mybox7): " + mybox7.volume());
    }
}

/* -----------------------------
Объем (mybox5): 3000.0
Объем (mybox6): -1.0
Объем (mybox7): 343.0

Соответствующий перегружаемый конструктор вызывается в зависимости от параметров,
указываемых при выполнении операции new.
 */