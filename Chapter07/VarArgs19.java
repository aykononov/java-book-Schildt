package Chapter07;
//Аргументы переменной длины и перегрузка
class VarArgs19 {
    static void vaTest(int ... v) {
        System.out.print("vaTest(int ... v): "
                        + "Количество аргументов: "
                        + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean ... v) {
        System.out.print("vaTest(boolean ... v): "
                        + "Количество аргументов: "
                        + v.length + " Содержимое: ");
        for (boolean x : v) System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(String msg, int ... v) {
        System.out.print("vaTest(String msg, int ... v): "
                        + "Количество аргументов: "
                        + msg + v.length + " Содержимое: ");
        for (int x : v) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest(true, false, true);
        vaTest("Проверка: ", 10, 20);
    }
}
/* --------------------------------------------------------------------------------
vaTest(int ... v): Количество аргументов: 3 Содержимое: 1 2 3
vaTest(boolean ... v): Количество аргументов: 3 Содержимое: true false true
vaTest(String msg, int ... v): Количество аргументов: Проверка: 2 Содержимое: 10 20
 */