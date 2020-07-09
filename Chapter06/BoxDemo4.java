/* В данном примере программы для инициализации
размеров параллелепипеда в классе Вох применяется
параметризированный конструктор
*/
package Chapter06;
// В классе Box4 применяется параметрзованный конструктор
class Box4 {
    double width;
    double heigth;
    double depth;

    // параметризованный конструктор для инициализации размеров
    Box4 (double w, double h, double d) {
        width  = w;
        heigth = h;
        depth  = d;
    }

    // метод рассчитывает и возвращает объем
    double volume () {
        return width * heigth * depth;
    }
}
public class BoxDemo4 {
    public static void main (String[] args) {

        // Создаем экземпляры класса Box4 по определенным размерам:
        // объявить, выделить память и инициализировать объекты;
        Box4 mybox4 = new Box4(10, 20, 15);
        Box4 mybox5 = new Box4(3, 6, 9);

        System.out.println("Объем (mybox4) = " + mybox4.volume());
        System.out.println("Объем (mybox5) = " + mybox5.volume());

    }
}
/* -----------------------
Объем (mybox4) = 3000.0
Объем (mybox5) = 162.0
 */