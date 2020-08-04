package Chapter13.Package01;

// Использовать класс BufferedReader для чтения символов с консоли
import java.io.*;

class BRRead {
    public static void main(String[] args) throws IOException {
        char c;

        //создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bвeдитe символы, 'q' - для выхода."); // читать символы

        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');
    }
}
/* -------------------------------
Введите символы, 'q' - для выхода.
123abcq
1
2
3
а
ь
с
q

 */