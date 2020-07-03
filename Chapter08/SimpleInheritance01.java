// Простой пример наследования (стр. 221)
package Chapter08;
// создать суперкласс
class SuperA {
    int i, j;

    void showA() {
        System.out.println("showA (i, j : " + i + ", " + j + ")");
    }
}

// Создать подкласс путем расширения класса A
class SubB extends SuperA {
    int k;

    void showB () {
        System.out.println("showB (k : " + k + ")");
    }

    int sum() {
        System.out.print("SubB.sum (i + j + k) = ");
        return i + j + k;
    }
}

class SimpleInheritance01 {
    public static void main (String[] args) {
        SuperA superA = new SuperA();
        SubB subB = new SubB();

        superA.i = 10;
        superA.j = 20;
        System.out.println("Вызов метода из Суперкласса SuperA.");
        superA.showA();

        System.out.println("\nВызов методов из Подкласса SubB.");
        subB.i = 20;
        subB.j = 30;
        subB.k = 10;
        subB.showB();
        System.out.println(subB.sum());
        subB.showA();
    }
}

/* --------------------------
Вызов из суперкласса SuperA.
showA (i, j : 10, 20)

Вызов из подкласса SubB.
showB (k : 10)
SubB.sum (i + j + k) = 60
showA (i, j : 20, 30)
 */