
package Chapter05;
// Применение оператора break во вложенных циклах
public class BreakWhile {
    public static void main (String[] args) {
        int i = 0;
        while (i < 3) {
            ++i;
            for (int j = 0; j < 10; j++) {
                if (j == 5) {
                    break;
                }
                System.out.print(j + " ");
            }
            System.out.print("прерываем вложенный цикл;\n");
        }
    }
}
/*
-----------------------------------
0 1 2 3 4 прерываем вложенный цикл;
0 1 2 3 4 прерываем вложенный цикл;
0 1 2 3 4 прерываем вложенный цикл;
 */