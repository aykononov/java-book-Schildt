package Chapter12.Package01;

// Пример, Перечисление сортов яблок
enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo {
    public static void main(String[] args) {
        Apple ap; // объявляется переменная ар перечислимого типа Apple

        ap = Apple.RedDel; //  переменной ар присваивается значение RedDel

        // вывести значение перечислимого типа
        System.out.println("Значение ap: " + ap);
        System.out.println();

        ap = Apple.GoldenDel;

        // сравнить два значения перечислимого типа
        if (ap == Apple.GoldenDel) System.out.println("Переменная ар содержит GoldenDel.\n");

        // применить перечисление для управления оператором switch
        switch (ap) {
            case Jonathan:
                System.out.println("Copт Jonathan красный.");
                break;
            case GoldenDel:
                System.out.println("Сорт Golden Delicious желтый.");
                break;
            case RedDel:
                System.out.println("Copт Red Delicious красный.");
                break;
            case Winesap:
                System.out.println("Copт Winesap красный.");
                break;
            case Cortland:
                System.out.println("Copт Cortland красный.");
                break;
        }
    }
}
/* ------------------------------
Значение ap: RedDel

Переменная ар содержит GoldenDel.

Сорт Golden Delicious желтый.
 */