package Chapter13.Package02;
/*
Копирование файла.
Чтобы воспользоваться этой программой, укажите
имена исходного и целевого файлов.
Например, чтобы скопировать файл FIRST.TXT
в файл SECOND.TXT, введите в командной строке
следующую команду:

java CopyFile FIRST.TXT SECOND.TXT
 */
import java.io.*;

class CopyFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // Проверяем, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Не указаны имена файлов: откуда куда");
            return;
        }

        // копировать файл
        try {
            // пробуем открыть файлы
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read(); // читаем файл
                if (i != -1) fout.write(i); // записываем файл
            } while (i != -1);

        } catch (IOException e) {
            System.out.println("Oшибкa ввода-вывода: " + e);
        } finally {
            try {
                if (fin != null) fin.close();
            } catch (IOException e2) {
                System.out.println("Ошибка закрытия файла ввода");
            }
            try {
                if (fout != null) fout.close();
            } catch (IOException e3) {
                System.out.println("Ошибка закрытия файла вывода");
            }
        }
    }
}
