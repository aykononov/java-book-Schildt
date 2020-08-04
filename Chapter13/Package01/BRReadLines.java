package Chapter13.Package01;

// Чтение символьных строк с консоли средствами класса BufferedReader
import java.io.*;

class BRReadLines {
    public static void main(String[] args) throws IOException {

        //создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Bвeдитe строки текста через <Enter>.");
        System.out.println("Bвeдитe 'стоп' для завершения:");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("стоп"));
    }
}
/* ---------------------------
Bвeдитe строки текста через <Enter>.
Bвeдитe 'стоп' для завершения:
1234 abc
стоп
 */