package Chapter18.Package01;

/* Эта программа суммирует ряд целых чисел, вводимых пользователем и преобразует
   строковое представление каждого числа в целое значение методом parseInt().
*/

import java.io.*;

class ParseDemo {
    public static void main(String[] args) throws IOException {
        // Cоздадим буферизованный поток чтения типа BufferedReader,
        // используя стандатный поток ввода System.in
        BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i, sum = 0;
        System.out.println("Bвeдитe число или 0 - для выхода.");
        do {
            str = bufRead.readLine();
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage() + "\nHeвepный формат");
                i = 0;
            }
            sum += i;
            System.out.println("Teкyщaя сумма: " + sum);
        } while (i != 0);
    }
}
/*
Bвeдитe число 0 - для выхода.
1
Teкyщaя сумма: 1
2
Teкyщaя сумма: 3
0
Teкyщaя сумма: 3
 */