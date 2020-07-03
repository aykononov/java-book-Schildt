// Еще один пример рекурсии
package Chapter07;

class RecTest{
    int[] arrs;

    RecTest(int i) {
        arrs = new int[i];
    }

    // выводим рекурсивно элементы массива
    void printArrs(int i) {
        if(i == 0) return;
        else printArrs(i - 1);
        System.out.println("[" + (i - 1) + "] " + arrs[i - 1]);
    }
}
public class Recursion06 {
    public static void main(String[] args) {
        RecTest obArrs = new RecTest(10);
        int i;
        for (i = 0; i < 10; i++)  obArrs.arrs[i] = i;
        obArrs.printArrs(10);
    }
}

/*
-------
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