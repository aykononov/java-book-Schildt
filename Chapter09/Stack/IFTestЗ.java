package Chapter09.Stack;

// Создать переменную интерфейса и обратиться к обоим стекам через нее
class IFTestЗ {
    public static void main(String[] args) {
        IntStack myStack;

        // создать переменную ссылки на интерфейс
        FixedStack fixedStack = new FixedStack(8);
        DynStack dynStack = new DynStack(5);

        myStack = dynStack; // загрузить динамический стек
        //разместить числа в стеке
        for (int i = 0; i < 12; i++) myStack.push(i);

        myStack = fixedStack; // загрузить фиксированный стек
        for (int i = 0; i < 8; i++) myStack.push(i);

        myStack = dynStack;
        System.out.print("Знaчeния в динамическом стеке:");
        for (int i = 0; i < 12; i++)
            System.out.print(" " + myStack.pop());

        myStack = fixedStack;
        System.out.print("\nЗнaчeния в фиксированном стеке:");
        for (int i = 0; i < 8; i++)
            System.out.print(" " + myStack.pop());
    }
}
/* -----------------------------------------------------
Знaчeния в динамическом стеке: 11 10 9 8 7 6 5 4 3 2 1 0
Знaчeния в фиксированном стеке: 7 6 5 4 3 2 1 0
 */