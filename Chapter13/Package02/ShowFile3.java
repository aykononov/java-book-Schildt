package Chapter13.Package02;

// Переделанная последовательность операторов try/catch
import java.io.*;

class ShowFile3 {
    public static void main(String[] args) {
        int i;
        FileInputStream fis = null;

        // Проверяем, что указано имя файла
        if (args.length != 1) {
            System.out.println("Не указано: имя_файла");
            return;
        }
// При таком подходе любая ошибка, в том числе и ошибка открытия файла, обрабатывается одним оператором catch.
        try {
            fis = new FileInputStream(args[0]);
            do {
                i = fis.read();
                if (i != -1) System.out.print((char)i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода: " + e);
        } finally {
            // закрыть файл в любом случае
            try {
                if (fis != null) fis.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }
    }
}
