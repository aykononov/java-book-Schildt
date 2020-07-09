
package Chapter06;
// В этой программе применяется метод с параметрами
class Box3 {
    double width;
    double height;
    double depth;

    // метод рассчитает и вернет объем
    double volume () {
        return width * height * depth;
    }

    // метод установит размеры коробки
    void setPar (double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }
}
public class BoxDemo3 {
    public static void main (String[] args) {
        Box3 mybox3 = new Box3();
        Box3 mybox4 = new Box3();

        // Инициализируем параметры
        mybox3.setPar(10, 20, 15);
        mybox4.setPar(3, 6, 9);

        // Получить объем
        System.out.println("Объем (mybox3) = " + mybox3.volume());
        System.out.println("Объем (mybox4) = " + mybox4.volume());
    }
}

/* -------------
Объем (mybox3) = 3000.0
Объем (mybox4) = 162.0
 */