package Chapter06;
// В этой программе объявляются два объекта класса Вох
class Box2 {
    double width;
    double height;
    double depth;

    // вводим метод расчета объема
    double volume () {
        return  width * height * depth;
    }
}

// В этом классе объявляются два объекта типа Box2
class BoxDemo2 {
    public static void main (String[] args) {
        Box2 mybox1 = new Box2();
        Box2 mybox2 = new Box2();

        // присваиваем значения переменным экземпляра mybox1
        mybox1.width  = 10;
        mybox1.height = 20;
        mybox1.depth  = 15;

        // присваиваем другие значения переменным экземпляра mybox2
        mybox2.width  = 3;
        mybox2.height = 6;
        mybox2.depth  = 9;

        // вывести объем первого параллелепипеда
        System.out.println("Объем = " + mybox1.volume());
        // вывести объем второго параллелепипеда
        System.out.println("Объем = " + mybox2.volume());

    }
}
/* --------------------
Объем = 3000.0
Объем = 162.0
 */