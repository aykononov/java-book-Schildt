package Chapter08;

class A {
    A() {      // конструктор по умолчанию
    }

    A(A obA) { // клон объекта
    }
}

class B extends A {
    B() {      // конструктор по умолчанию
    }

    B(B obB) { // клон объекта
    }
}

class ReferenceVariables04 {
    public static void main(String[] args) {
        A supA = new A();
        A clnA = new A(supA);
        B subB = new B();
        A clnC = new B(subB);
        B clnB = new B(subB);
        B clnD = new B(subB);

        System.out.println("Посмотрим на ссылочные переменные.");
        System.out.println("supA : " + supA);
        System.out.println("clnA : " + clnA);
        System.out.println("subB : " + subB);
        System.out.println("clnC : " + clnC);
        System.out.println("clnB : " + clnB);
        System.out.println("clnD : " + clnB);
        System.out.print("\nclnB == clnD, ");
        System.out.println(clnB == clnD);
        clnB = clnD;
        System.out.println("\nclnB = clnD :");
        System.out.println("clnB : " + clnB);
        System.out.println("clnD : " + clnD);
        System.out.print("\nclnB == clnD, ");
        System.out.println(clnB == clnD);

    }
}

/* --------------------------------
Посмотрим на ссылочные переменные.
supA : Chapter08.A@16d3586
clnA : Chapter08.A@154617c
subB : Chapter08.B@a14482
clnC : Chapter08.B@140e19d
clnB : Chapter08.B@17327b6
clnD : Chapter08.B@17327b6

clnB == clnD, false

clnB = clnD :
clnB : Chapter08.B@14ae5a5
clnD : Chapter08.B@14ae5a5

clnB == clnD, true
*/