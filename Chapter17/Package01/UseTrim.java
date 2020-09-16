package Chapter17.Package01;

// Использовать метод trim() для обработки команд, вводимых пользователем
import java.io.*;

class UseTrim {
    public static void main(String[] args) {

        System.out.println("Bвeдитe 'стоп' для завершения.");
        System.out.println("Bвeдитe название штата: ");

        try {
            // Создаем буферизованный поток чтения данных
            // типа BufferedReader, используя стандатный поток ввода System.in
            BufferedReader bufRead = new BufferedReader(new InputStreamReader(System.in));
            String str;
            do {
                str = bufRead.readLine();
                str = str.trim(); // удалить пробелы
                if (str.equals("Иллинойс")) System.out.println("стoлицa - Спрингфилд.");
                else if (str.equals("Миссури")) System.out.println("стoлицa - Джефферсон-сити.");
                else if (str.equals("Калифорния")) System.out.println("стoлицa - Сакраменто.");
                else if (str.equals("Вашингтон")) System.out.println("стoлицa - Олимпия.");
                // ...
            } while (!str.equals("стоп"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
/* ----------------------------
Bвeдитe 'стоп' для завершения.
Bвeдитe название штата:
Миссури
стoлицa - Джефферсон-сити.
Иллинойс
стoлицa - Спрингфилд.
Калифорния
стoлицa - Сакраменто.
Вашингтон
стoлицa - Олимпия.
стоп
 */