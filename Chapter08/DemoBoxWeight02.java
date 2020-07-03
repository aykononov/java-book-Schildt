package Chapter08;

// В этой программе наследование применяется для расширения класса Вох (стр. 224 - 227)
class Box {
    double width;
    double height;
    double depth;


    // сконструировать клон объекта
    Box (Box ob) { // передаем объект конструктору
        width  = ob.width;
        height = ob.height;
        depth  = ob.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box (double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    // конструктор, применяемый при пустых занчениях размеров
    Box () { // значение -1 служит для неинициализированного праллелепипеда
        width  = -1;
        height = -1;
        depth  = -1;
    }

    //конструктор, применяемый при создании куба
    Box (double len) {
        width = height = depth = len;
    }

    // метод расчитывает и возвращает объем параллелепипеда
    double volume () {
        return width * height * depth;
    }
}
// наследовать класс Box и расширить его, включив поле веса weight;
class SubBox extends Box {
    double weight;

    // конструктор класса SubBox - для куба
    SubBox (double l , double m) {
        width = height = depth = l;
        weight = m;
    }

    // конструктор класса SubBox - задать значения пераллелепипеда + вес
    SubBox (double w, double h, double d, double m) {
        width  = w;
        height = h;
        depth  = d;
        weight = m;
    }

}
class DemoBoxWeight02 {
    public static void main (String[] args) {

        Box mySuperCube = new Box(3); // создать куб Суперкласса
        System.out.println("Объем куба (mySuperCube.volume): " + mySuperCube.volume());
        System.out.println();

        Box mySuperOb = new Box(2,3,4); // создать параллелепипед Суперкласса
        System.out.println("Объем параллелепипеда (mySuperOb.volume): " + mySuperOb.volume());
        System.out.println();

        SubBox mySubCube = new SubBox(3, 2); // создать куб из Подкласса
        System.out.println("Объем куба (mySubCube.volume): " + mySubCube.volume());
        System.out.println("Вес куба (mySubCube.weight): " + mySubCube.weight);
        System.out.println();

        SubBox mySubBox = new SubBox(4, 3, 2, 1); // создать параллелепипед из Подкаласса
        System.out.println("Объем параллелепипеда (mySubBox.volume): " + mySubBox.volume());
        System.out.println("Вес параллелепипеда (mySubBox.weight): " + mySubBox.weight);
        System.out.println();

        // Присвоить Ссылочной переменной Суперкласса ссылку на объект Подкласса
        mySuperCube = mySubCube;

        // Однако для ссылочной переменной Суперкласса доступны поля, только из Суперкласса
        System.out.println("Ссылочная переменная mySuperCube - Куб.");
        System.out.println("Поле (mySuperCube.width): " + mySuperCube.width);
        System.out.println("Поле (mySuperCube.height): " + mySuperCube.height);
        System.out.println("Поле (mySuperCube.depth): " + mySuperCube.depth);
        System.out.println("Поле (mySuperCube.volume): " + mySuperCube.volume());
        System.out.println("Поле (mySuperCube.weight): - поле Вес НЕ Доступно !!!");
        System.out.println();

        // Присвоить Ссылочной переменной Суперкласса ссылку на объект Подкласса
        mySuperOb = mySubBox;

        // Так же и для другой ссылочной переменной Суперкласса доступны поля, только из Суперкласса
        System.out.println("Ссылочная переменная mySuperOb - Параллелепипед.");
        System.out.println("Поле (mySuperOb.width): " + mySuperOb.width);
        System.out.println("Поле (mySuperOb.height): " + mySuperOb.height);
        System.out.println("Поле (mySuperOb.depth): " + mySuperOb.depth);
        System.out.println("Поле (mySuperOb.volume):" + mySuperOb.volume());
        System.out.println("Поле (mySuperOb.weight): - поле Вес НЕ Доступно !!!");

    }
}

/* ---------------------------------------------
Объем куба (mySuperCube.volume): 27.0

Объем параллелепипеда (mySuperOb.volume): 24.0

Объем куба (mySubCube.volume): 27.0
Вес куба (mySubCube.weight): 2.0

Объем параллелепипеда (mySubBox.volume): 24.0
Вес параллелепипеда (mySubBox.weight): 1.0

Ссылочная переменная mySuperCube - Куб.
Поле (mySuperCube.width): 3.0
Поле (mySuperCube.height): 3.0
Поле (mySuperCube.depth): 3.0
Поле (mySuperCube.volume): 27.0
Поле (mySuperCube.weight): - поле Вес НЕ Доступно !!!

Ссылочная переменная mySuperOb - Параллелепипед.
Поле (mySuperOb.width): 4.0
Поле (mySuperOb.height): 3.0
Поле (mySuperOb.depth): 2.0
Поле (mySuperOb.volume):24.0
Поле (mySuperOb.weight): - поле Вес НЕ Доступно !!!
*/