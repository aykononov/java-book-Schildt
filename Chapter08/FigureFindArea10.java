package Chapter08;

// Создается суперкласс Figure для хранения размеров двумерного объекта
class Figure {
    double side1;
    double side2;

    Figure(double a, double b) {
        side1 = a;
        side2 = b;
    }

    // Определяется метод area() для расчета площади объекта
    double area() {
        System.out.print("Площадь фигуры не определена : ");
        return 0;
    }
}

class Rectangle extends Figure {

    Rectangle(double a, double b) {
        super(a, b);
    }

    // Переопределяем метод area() для расчета и возврата площади четырехугольника
    double area() {
        System.out.print("Площадь четырехугольника : ");
        return side1 * side2;
    }
}

class Triangle extends Figure {

	Triangle(double a, double b) {
        super(a, b);
    }

    // Переопределяем метод area() для расчета и возврата площади треугольника
	double area()	{
	    System.out.print("Площадь треугольника : ");
        return side1 * side2 / 2;
    }

}

class FigureFindArea10 {
    public static void main(String[] args) {
        Figure ob = new Figure(2,3);
        Rectangle obR = new Rectangle(2, 3);
        Triangle obT = new Triangle(2, 3);
        Figure ref;

        ref = ob;
        //Так, если объект относится к классу, производному от класса Figure, его площадь можно рассчитать, вызвав метод area ().
        System.out.println(ob.area());

        // Присваиваем ссылке объект четырехугольника
        ref = obR;
        System.out.println(ref.area());

        // Присваиваем ссылке объект треугольника
        ref = obT;
        System.out.println(ref.area());

    }
}
/* -------------------------------
Площадь фигуры не определена : 0.0
Площадь четырехугольника : 6.0
Площадь треугольника : 3.0
*/