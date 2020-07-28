package Chapter12.Package03;

// Продемонстрировать применение методов ordinal(), compareTo() и equals()
enum Apple4 {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}

class EnumDemo4 {
    public static void main(String[] args) {
        Apple4 ap1, ap2, ap3;

        System.out.println("Получить все константы и порядковые значения:");

        for(Apple4 a: Apple4.values()) {
            System.out.println(a + " " + a.ordinal());
        }

        ap1 = Apple4.RedDel;
        ap2 = Apple4.GoldenDel;
        ap3 = Apple4.RedDel;

        System.out.println("\nПродемонстрировать применение метода compareTo():");
        if (ap1.compareTo(ap2) < 0) System.out.println(ap1 + " предшествует " + ap2);
        if (ap1.compareTo(ap2) > 0) System.out.println(ap2 + " предшествует " + ap1);
        if (ap1.compareTo(ap3) == 0) System.out.println(ap1 + " равно " + ap3);

        System.out.println("\nПродемонстрировать применение метода equals():");
        if (ap1.equals(ap2)) System.out.println("Ошибка!");
        if (ap1.equals(ap3)) System.out.println(ap1 + " равно " + ap3);

        System.out.println("\nСравнить на равенство:");
        if (ap1 == ap3) System.out.println(ap1 + " == " + ap3);
    }
}
/* ----------------------------------------------
Получить все константы и порядковые значения:
Jonathan 0
GoldenDel 1
RedDel 2
Winesap 3
Cortland 4

Продемонстрировать применение метода compareTo():
GoldenDel предшествует RedDel
RedDel равно RedDel

Продемонстрировать применение метода equals():
RedDel равно RedDel

Сравнить на равенство:
RedDel == RedDel

 */