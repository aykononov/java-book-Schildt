
package Chapter08;

// Расширение класса BoxWeight созданием Подкласса BoxShipment
// с добавлением поля cost - стоимость доставки (стр. 232 - 235)
class Box05 {
    private double width;
    private double height;
    private double depth;

    // Контсруктор клонирует объект
    Box05(Box05 ob05) { // передаемконструтктору объект
        width  = ob05.width;
        height = ob05.height;
        depth  = ob05.depth;
    }

    // Конструктор, применяемый при указании всех размеров
    Box05(double w, double h, double d) {
        width  = w;
        height = h;
        depth  = d;
    }

    // Конструктор, применяемый в отсутствие размеров
    Box05() {
        width  = -1;
        height = -1;
        depth  = -1;
    }

    // Конструктор, применяемый при создании Куба
    Box05(double len) {
        width = height = depth = len;
    }

    // Метод рассчитывает и возвращает объем volume.
    double volume() {
        return width * height * depth;
    }
}

// Добавляем поле - Веса.
class BoxWeight05 extends Box05 {
    double weight; // Вес

    // Контсруктор клонирует объект
    BoxWeight05(BoxWeight05 ob05) {
        super(ob05);
        weight = ob05.weight;
    }

    // Конструктор, применяемый при указании всех размеров
    BoxWeight05(double w, double h, double d, double m) {
        super(w, h, d);
        weight = m;
    }

    // Конструктор, применяемый в отсутствие размеров
    BoxWeight05(){
        super();
        weight = -1;
    }

    // Конструктор, применяемый при создании Куба
    BoxWeight05(double len, double m) {
        super(len);
        weight = m;
    }
}

// Добавляем поле - Стоимости.
class BoxCost05 extends BoxWeight05 {
    double cost; // Стоимость

    // Контсруктор клонирует объект
    BoxCost05(BoxCost05 ob05) {
        super(ob05);
        cost = ob05.cost;
    }

    // Конструктор, применяемый при указании всех размеров
    BoxCost05(double w, double h, double d, double m, double c) {
        super(w, h, d, m);
        cost = c;
    }

    // Конструктор, применяемый в отсутствие размеров
    BoxCost05() {
        super();
        cost = -1;
    }

    // Конструктор, применяемый при создании Куба
    BoxCost05(double len, double m, double c) {
        super(len, m);
        cost = c;
    }
}

class DemoShipment05 {
    public static void main(String[] args) {
        BoxCost05 shipment1 = new BoxCost05(2,3,4,1.5,100.00);
        BoxCost05 shipment2 = new BoxCost05(shipment1); // клонируем посылку
        BoxCost05 shipment3 = new BoxCost05(2,1.3,50.00); // куб
        BoxCost05 shipment4 = new BoxCost05(); // посылка без размеров
        double volume; // Объем

        System.out.println("Посылка shipment1. (параллелепипед)");
        volume = shipment1.volume();
        System.out.println("Стоимость\t- " + shipment1.cost +
                           "\nОбъем\t\t- " + volume +
                           "\nВес\t\t\t- " + shipment1.weight);

        System.out.println("\nПосылка shipment2. (склонированная)");
        volume = shipment2.volume();
        System.out.println("Стоимость\t- " + shipment2.cost +
                           "\nОбъем\t\t- " + volume +
                           "\nВес\t\t\t- " + shipment2.weight);

        System.out.println("\nПосылка shipment3. (куб)");
        volume = shipment3.volume();
        System.out.println("Стоимость\t- " + shipment3.cost +
                           "\nОбъем\t\t- " + volume +
                           "\nВес\t\t\t- " + shipment3.weight);

        System.out.println("\nПосылка shipment4. (без параметорв)");
        volume = shipment4.volume();
        System.out.println("Стоимость\t- " + shipment4.cost +
                           "\nОбъем\t\t- " + volume +
                           "\nВес\t\t\t- " + shipment4.weight);

        System.out.print("\nСравним посылки. (т.е. ссылки на объекты)\nshipment1 = shipment2 , ");
        System.out.println(shipment1 == shipment2);
    }
}
/*-----------------------------------------
Посылка shipment1. (параллелепипед)
Стоимость	- 100.0
Объем		- 24.0
Вес			- 1.5

Посылка shipment2. (склонированная)
Стоимость	- 100.0
Объем		- 24.0
Вес			- 1.5

Посылка shipment3. (куб)
Стоимость	- 50.0
Объем		- 8.0
Вес			- 1.3

Посылка shipment4. (без параметорв)
Стоимость	- -1.0
Объем		- -1.0
Вес			- -1.0

Сравним посылки. (т.е. ссылки на объекты)
shipment1 = shipment2 , false
 */