package Chapter13.Package02;
// Создание, чтение одного файла и копирование в другой файл по байтам
import java.io.*;
class WriteReadSaveToFile {
    public static void main(String[] args) {

        String text = "Test\n1234"; // Входящая строка символов
        String path = "./Chapter13/"; // Путь к файлу
        String file = "File.txt"; // Имя файла
        String filesave = "FileSave.txt"; // Копия файла

        try (FileOutputStream fout = new FileOutputStream(path + file); // Объект вывода для записи
             FileInputStream finp = new FileInputStream(path + file);
             FileOutputStream fsave = new FileOutputStream(path + filesave)) // Объект ввода для чтения
        {

            // Читаем и кодируем строку text в последовательность байтов,
            // сохраняем результат в новый массив байтов buffer.
            byte[] buffer = text.getBytes();

            // Выводим размер массиа (количество байт буфера)
            System.out.println(buffer.length + " байт в строке для записи в файл:");

            // Запсисываем в объект fout из массива байтов buffer начиная со смещения 0 и до конца массива
            fout.write(buffer, 0, buffer.length);

            // Читаем массив байтов и приводим к типу char для вывода в консоль
            for (int i : buffer) {
                System.out.print((char)i);
            }
            System.out.println("\nФайл записан успшено.\n");

            // Выводим количество байт потока
            System.out.println(finp.available() + " байт для чтения из файла:");

            // Читаем из объекта finp, начиная со смещения 0 и до конца и передаем в массив байтов buffer
            finp.read(buffer, 0, finp.available());

            // Читаем массив байтов и приводим к типу char для вывода в консоль
            for (int i : buffer) {
                System.out.print((char)i);
            }
            System.out.println("\nФайл прочтен успшено.\n");

            // Скопируем из буфера в новый файл
            fsave.write(buffer, 0, buffer.length);
            System.out.println("Копирование в новый файл " + filesave + " - выполнено успешно.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
/* -------------------------------
9 байт в строке для записи в файл:
Test
1234
Файл записан успшено.

9 байт для чтения из файла:
Test
1234
Файл прочтен успшено.

Копирование в новый файл FileSave.txt - выполнено успешно.
 */