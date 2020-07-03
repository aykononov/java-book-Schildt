package Chapter08;
// Порядок вызова конструкторов (стр. 235)
class supA {
    supA(){
        System.out.println("Конструктор класса supA.");
    }
}
class subB extends supA{
    subB() {
        System.out.println("Конструктор класса subB.");
    }
}
class subC extends subB{
    subC() {
        System.out.println("Конструктор класса subC.");
    }
}
class CallingConstr06 {
    public static void main(String[] args) {
        subC obC = new subC();
    }
}
/* ---------------------
Конструктор класса supA.
Конструктор класса subB.
Конструктор класса subC.
 */