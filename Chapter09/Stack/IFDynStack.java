package Chapter09.Stack;

// Реализация "наращиваемого" стека
class DynStack implements IntStack {
    private int stck[];
    private int tos;

    // выделить память и инициализировать стек
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        // если стек заполнен, выделить память под стек большего размера
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];

            // удвоить размер стека
            for (int i = 0; i < stck.length; i++) temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        }
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Cтeк не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFDynStack {
    public static void main(String[] args) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);

        // В этих циклах увеличиваются размеры каждого стека
        for (int i = 0; i < 12; i++) mystack1.push(i);
        for (int i = 0; i < 20; i++) mystack2.push(i);

        System.out.print("Стек в mystack1:");
            for (int i = 0; i < 12; i++) System.out.print(" " + mystack1.pop());

        System.out.print("\nСтек в mystack2:");
            for (int i = 0; i < 20; i++) System.out.print(" " + mystack2.pop());

    }
}
/* ---------------------------------------------------------------
Стек в mystack1: 11 10 9 8 7 6 5 4 3 2 1 0
Стек в mystack2: 19 18 17 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1 0
 */