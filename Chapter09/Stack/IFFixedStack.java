package Chapter09.Stack;

// Реализация интерфейса IntStack для стека фиксированного размера
class FixedStack implements IntStack {
    private int stck[];
    private int tos;

    // выделяем память и инициализируем стек
    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // разместить элемент в стеке
    public void push(int item) {
        if (tos == stck.length - 1) // использовать поле длины стека
            System.out.println("Стек заполнен.");
        else
            stck[++tos] = item;
    }

    // извлечь элемент из стека
    public int pop() {
        if (tos < 0) {
            System.out.println("Стек не загружен.");
            return 0;
        }
        else
            return stck[tos--];
    }
}

class IFFixedStack {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 = new FixedStack(8);

        // разместить числа в стеке
        for (int i = 0; i < 5; i++) mystack1.push(i);
        for (int i = 0; i < 8; i++) mystack2.push(i);

        // извлечь числа из стека
        System.out.print("Стек в mystack1:");
        for (int i = 0; i < 5; i++)
            System.out.print(" " + mystack1.pop());

        System.out.print("\nСтек в mystack2:");
        for (int i = 0; i < 8; i++)
            System.out.print(" " + mystack2.pop());

    }
}
/* -----------------------------
Стек в mystack1: 4 3 2 1 0
Стек в mystack2: 7 6 5 4 3 2 1 0
 */