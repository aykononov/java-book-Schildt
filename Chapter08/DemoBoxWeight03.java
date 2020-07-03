
package Chapter08;

// Теперь в Подклассе SubBox03 полностью реализованы все конструкторы из Суперкласса (стр. 228 - 231)
// Члены Суперкласса width, height, depth объявлены как закрытые.
class Box03 {
    private double width;
    private double height;
    private double depth;

    // сконструировать клон объекта
    Box03(Box03 ob03) { // передать объект конструктору
        width  = ob03.width;
        height = ob03.height;
        depth  = ob03.depth;
    }

    // конструктор, применяемый при указании всех размеров
    Box03(double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    // конструктор, применяемый в отсутствие размеров
    Box03() {
        width  = -1;
        height = -1;
        depth  = -1;
    }

    // конструктор, применяемый при создании Куба
    Box03(double len) {
        width = height = depth = len;
    }

    // Метод рассчитывает и возвращает объем volume.
    double volume() {
        return width * height * depth;
    }
}

class SubBox03 extends Box03 {
    double weight; // вес параллелепипеда

    // сконструировать клон объекта
    SubBox03(SubBox03 subOb03) { //передать объект конструктору
        super(subOb03);
        weight = subOb03.weight;
    }

    // конструктор, применяемый при указании всех размеров
    SubBox03(double subW, double subH, double subD, double m) {
        super(subW, subH, subD); // вызвать конструктор из Суперкласса
        weight = m;
    }

    // конструктор, применяемый в отсутствие размеров
    SubBox03() {
        super();
        weight = -1;
    }

    // конструктор, применяемый при создании Куба
    SubBox03(double subLen, double m) {
        super(subLen);
        weight = m;
    }

}

class DemoBoxWeight03 {
    public static void main (String[] args) {

        SubBox03 mybox1 = new SubBox03(2,3,4,2.5); // создать объект Параллелепипед
        SubBox03 mycube = new SubBox03(2, 1.3); // создать объект Кубе
        SubBox03 mybox0 = new SubBox03(); // по умолчанию
        SubBox03 myclone = new SubBox03(mybox1); // склонировать объект Параллелепипеда
        Box03 superbox3 = new Box03(); // создать объект из Суперкласса
        double myvolume;

        myvolume = mybox1.volume();
        System.out.println("Параллелепипед объемом: " + myvolume + " имеет вес: " + mybox1.weight);

        myvolume = mycube.volume();
        System.out.println("Куб объемом: " + myvolume + " имеет вес: " + mycube.weight);

        myvolume = mybox0.volume();
        System.out.println("По умолчанию объем: " + myvolume + " и вес: " + mybox0.weight);

        myvolume = myclone.volume();
        System.out.println("Клон объемом: " + myvolume + " имеет вес: " + myclone.weight);

    }

}

/* ----------------------------------------
Параллелепипед объемом: 24.0 имеет вес: 2.5
Куб объемом: 8.0 имеет вес: 1.3
По умолчанию объем: -1.0 и вес: -1.0
Клон объемом: 24.0 имеет вес: 2.5
*/