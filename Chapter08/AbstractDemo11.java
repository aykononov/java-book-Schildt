package Chapter08;

// Применение абстрактных методов и классов
abstract class Figure11 {
    double side1;
    double side2;

    Figure11(double a, double b) {
        side1 = a;
        side2 = b;
    }

    // Теперь метод area() объявляется абстрактным и должен быть переопределен во всех подклассах
    abstract double area();
}

class Rectangle11 extends Figure11 {

    Rectangle11(double a, double b) {
        super(a, b);
    }

    // Переопределяем метод area() для расчета площади и возврата четырехугольника
    double area() {
        System.out.print("Площадь четырехугольника : ");
        return side1 * side2;
    }
}

class Triangle11 extends Figure11 {

    Triangle11(double a, double b) {
        super(a, b);
    }

    // Переопределяем метод area() для расчета площади и возврата треугольника
    double area() {
        System.out.print("Площадь треугольника : ");
        return side1 * side2 / 2;
    }
}
// Объекты класса Figure не объявляются
class AbstractDemo11 {
    public static void main (String[] args) {

        Rectangle11 obR = new Rectangle11(2, 3);
        Triangle11  obT = new Triangle11(2, 3);

        // Переменная ref объявлена как ссылка на класс Figure,
        // т.е. ее можно использовать для ссылки на объект любого подкласса
        Figure11 ref;

        // Присваиваем ссылке объект четырехугольника
        ref = obR;
        System.out.println(ref.area());

        // Присваиваем ссылке объект треугольника
        ref = obT;
        System.out.println(ref.area());
    }
}
/* ---------------------------
Площадь четырехугольника : 6.0
Площадь треугольника : 3.0
 */