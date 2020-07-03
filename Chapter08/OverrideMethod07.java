package Chapter08;

// Переопределение методов (стр. 236 - 237)
class E {
    int i, j;
    E(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("Вывод переменных i, j : " + i + " , " + j);
    }
}
class F extends E {
    int k;
    F(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // метод переопределяет метод show() из Суперкласса E
    void show() {
        System.out.println("Метод show() из Суперкласса E");
        super.show();
        System.out.println("Вывод переменной k : " + k);
    }

}

class OverrideMethod07 {
    public static void main(String[] args) {
        F obF = new F(1,2,3);
        obF.show();
    }
}
/* --------------------------
Метод show() из Суперкласса E
Вывод переменных i, j : 1 , 2
Вывод переменной k : 3
 */