package Chapter10;

//Пример применения вложенных операторов try
class NestedTry {
    public static void main (String[] args) {
        try {
            int a = args.length;

            /* Если не указаны аргументы командной строки,
               в следующем операторе будет сгенерировано
               исключение в связи с делением на нуль. */
            int b = 10 / a;
            System.out.println("a = " + a);

            try { // вложенный блок try

                /* Если указан один аргумент командной строки,
                   то исключение в связи с делением на нуль
                   будет сгенерировано в следующем коде. */
                if (a == 1) a = a / (a - a ); // деление на нуль

                /* Если указаны два аргумента командной строки,
                   то генерируется исключение в связи с выходом
                   за пределы массива. */
                if (a == 2) {
                    int[] c = { 1 };
                    c[10] = 99; // здесь генерируется исключение в связи с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива: " + e);
            }
        } catch (ArithmeticException e) {
            System.out.println("Деление на нуль: " + e);
        }
    }
}
/* ------------------------------------------------------
C:\>java NestTry
Деление на нуль: java.lang.ArithmeticException: / by zero

C:\>java NestTry One
а = 1
Деление на нуль: java.lang.ArithmeticException: / by zero

C:\>java NestTry One ТWо
а = 2
Индекс за пределами массива: java.lang.ArrayindexOutOfBoundsException:10
 */