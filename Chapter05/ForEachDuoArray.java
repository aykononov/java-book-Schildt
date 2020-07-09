package Chapter05;
//Применение цикла for в стиле for each для обращения к двухмерному массиву
public class ForEachDuoArray {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arrs = new int[3][5];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                arrs[i][j] = j + 1;

        // цикл  for each для вывода двумерного массива
        for (int x[] : arrs) {
            for (int y : x) {
                System.out.print(y + " ");
                sum += y;
            }
            System.out.println();
        }
        System.out.println("Сумма: " + sum);
    }
}
/*
----------------
1 2 3 4 5 = 15
1 2 3 4 5 = 30
1 2 3 4 5 = 45
Сумма: 45
 */