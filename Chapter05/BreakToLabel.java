
package Chapter05;
// Применение оператора Ьreak с меткой для выхода из вложенных циклов.
public class BreakToLabel {
    public static void main(String[] args){
        exit: for (int i = 0; i < 3; i++) {
                System.out.print("Проход " + i + ": ");
                for (int j = 0; j < 100; j++) {
                    if (j == 10) break exit; // выход из обоих циклов
                    System.out.print(j + " ");
                }
                System.out.println("Эта строка не выводится");
              }
        System.out.println("Циклы завершены.");
    }
}
/*
---------------------------------------------
Проход 0: 0 1 2 3 4 5 6 7 8 9 Циклы завершены.
 */