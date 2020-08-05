package Chapter13.Package02;
/*
Отображение содержимого текстового файла.
Чтобы воспользоваться этой программой, укажите
имя файла, который требуется просмотреть.
Например, чтобы просмотреть файл TEST.TXT,
введите в командной строке следующую команду:

java ShowFile TEST.TXT
*/

//Отображение содержимого текстового файла
import java.io.*;

class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;

        // Сначала проверяем, что имя файла указано
        if (args.length != 1) {
            System.out.println("Использование: ShowFile.main имя_файла");
            System.out.println("Не указано: имя_файла");
            return;
        }

        // Пробуем открыть файл
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("Heвoзмoжнo открыть файл");
            return;
        }

        // Теперь файл открыт и готов к чтению.
        // Далее из него читаются символы до тех пор, пока не встретится признак конца файла
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("Oшибкa чтения из файла");

        //  если выполнение кода, в котором происходит обращение к файлу, прекращается из-за каких-нибудь исключений,
        //  не связанных с операциями ввода-вывода, то файл все равно будет закрыт в блоке оператора finally
        } finally {

            // закрыть файл при выходе из блока оператора try
            try {
                fin.close();
            } catch (IOException e) {
                System.out.println("При ошибке закрытия файла");
            }
        }

        // Закрываем файл
        try {
            fin.close();
        } catch (IOException e) {
            System.out.println("Oшибкa закрытия файла");
        }
    }
}
