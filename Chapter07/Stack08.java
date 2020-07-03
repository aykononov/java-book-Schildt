/* Усовершенствованная весрия класса Stack */
package Chapter07;

// В этом классе определяется целочисленный стек, который может содержать 10 значений
public class Stack08 {
    /* Теперь переменные stck и tos являются закрытыми.
       Это означает, что они не могут быть случайно или
       намеренно изменены таким образом, чтобы нарушить стек. */
    private int[] stck = new int[10];
    private int tos;

    // инициализировать вершину стека
    Stack08() {
        tos = -1;
    }

    // поместить элемент в стек
    void push(int item) {
        if (tos == 9)
            System.out.println("Стек загружен. (нет места для элемента): " + item);
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    int pop() {
        if (tos < 0) {
            System.out.print(" (Стек пуст.)");
            return 0;
        }
        else
            return stck[tos--];
    }
}
