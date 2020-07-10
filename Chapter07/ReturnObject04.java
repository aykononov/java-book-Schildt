
package Chapter07;
// Возврат объекта.
class Test04 {
    int a;

    Test04(int i) {
        a = i;
    }

    Test04 incrByTen() {
        Test04 temp = new Test04(a + 10);
        return temp;
    }
}
class ReturnObject04 {
    public static void main(String[] args) {
        Test04 ob1 = new Test04(2);
        Test04 ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a после второго увеличения: " + ob2.a);
        System.out.println("ob1.a: " + ob1.a);
    }
}

/* ------------------------------------
ob1.a: 2
ob2.a: 12
ob2.a после второго увеличения: 22
 */