
package Chapter06;
// Применение класса Stack
public class TestStack {
    public static void main (String[] args) {
        Stack mystack1 = new Stack();
        Stack mystack2 = new Stack();

        // разместить числа в стеке
        for (int i = 0; i < 10; i++)
            mystack1.push(i);
        for (int i = 10; i < 20; i++)
            mystack2.push(i);

        // извлечь эти числа из стека
        System.out.println("Содержимое стека (mystack1):");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack1.pop() + " ");

        System.out.println("\nСодержимое стека (mystack2):");
        for (int i = 0; i < 10; i++)
            System.out.print(mystack2.pop() + " ");
    }
}
/* -------------------------------------
Содержимое стека (mystack1):
9 8 7 6 5 4 3 2 1 0
Содержимое стека (mystack2):
19 18 17 16 15 14 13 12 11 10
 */