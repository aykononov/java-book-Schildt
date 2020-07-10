// Еще один пример рекурсии
// В данном примере рекурсивный метод printArray() выводит первые i элементов из массива values.
package Chapter07;

class RecTest{
    int[] values;

    RecTest(int i) {
        values = new int[i];
    }

    // выводим рекурсивно элементы массива
    void printArray(int i) {
        if(i == 0) return;
        else printArray(i - 1);
        System.out.println("[" + (i - 1) + "] " + values[i - 1]);
    }
}
public class Recursion06 {
    public static void main(String[] args) {
        RecTest obArrs = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++)  obArrs.values[i] = i;
        obArrs.printArray(10);
    }
}

/* ---
[0] 0
[1] 1
[2] 2
[3] 3
[4] 4
[5] 5
[6] 6
[7] 7
[8] 8
[9] 9
 */