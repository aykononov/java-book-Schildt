package Chapter13.Package01;

// Простейший текстовый редактор
import java.io.*;

class TinyEdit {
    public static void main(String[] args) throws IOException {
        // создать поток ввода типа BufferedReader, используя стандартный поток ввода System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = new String[100];
        System.out.println("Bвeдитe строки текста через <Enter>.");
        System.out.println("Bвeдитe 'стоп' для завершения:");
        for (int i = 0; i < 100; i++) {
            str[i] = br.readLine();
            if (str[i].equals("стоп")) break;
        }
        System.out.println("\nCoдepжимoe вашего файла:");
        // вывести текстовые строки
        for (int i = 0; i < 100; i++) {
            if (str[i].equals("стоп")) break;
            System.out.println(str[i]);
        }
    }
}
/* ---------------------------------
Bвeдитe строки текста через <Enter>.
Bвeдитe 'стоп' для завершения:
**************
Первая строка.
Вторая строка.
1234567890
**************
стоп

Coдepжимoe вашего файла:
**************
Первая строка.
Вторая строка.
1234567890
**************
 */