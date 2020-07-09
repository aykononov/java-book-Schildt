
package Chapter07;
// В этой версии класса Вох один объект допускается инициализировать другим объектом
class Box6 {
    double width;
    double height;
    double depth;

    // Обратите внимание на этот конструктор.
    // В качестве параметра в нем используется объект типа Вох.
    Box6 (Box6 ob) { //передать объект конструктору
        width  = ob.width;
        height = ob.height;
        depth  = ob.depth;
    }

    // конструктор, используемый, когда указываются все размеры.
    Box6 (double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    // конструктор, используемый, если ни один из размеров не указан
    // значение -1 используется для обозначения неинициализированного параллелепипеда
    Box6 () {
        width  = -1;
        height = -1;
        depth  = -1;
    }

    // конструктор, используемый при создании куба
    Box6 (double len) {
        width = height = depth = len;
    }

    // метод расчета и вывода объема
    double volume () {
        return width * height * depth;
    }
}

public class BoxDemo01 {
    public static void main (String[] args) {
        // создадим параллелепипеды используя разные конструкторы
        Box6 mybox6 = new Box6 (10, 20, 15);
        Box6 mybox7 = new Box6 ();
        Box6 mycube = new Box6 (7);

        // Создадим копию объекта mybox6
        Box6 myclone = new Box6 (mybox6);

        System.out.println("Объем (mybox6): " + mybox6.volume());
        System.out.println("Объем (mybox7): " + mybox7.volume());
        System.out.println("Объем (mycube): " + mycube.volume());
        System.out.println("Объем клона (myclone): " + myclone.volume());
    }
}

/* --------------------------
Объем (mybox6): 3000.0
Объем (mybox7): -1.0
Объем (mycube): 343.0
Объем клона (myclone): 3000.0
 */