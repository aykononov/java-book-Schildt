package Chapter13;
import java.io.*;
class SaveToFile {
    public static void main(String[] args) {

        String text = "Test\n1234"; // Входящая строка символов
        String path = "./Chapter13/SaveToFile.txt"; // Путь к файлу

        try (FileOutputStream fout = new FileOutputStream(path); // Поток для записи
             FileInputStream finp = new FileInputStream(path)) // Поток для чтения
        {

            // Читаем и кодируем строку text в последовательность байтов,
            // сохраняем результат в новый массив байтов buffer.
            byte[] buffer = text.getBytes();

            // Выводим количество байт
            System.out.println(buffer.length + " байт в строке для записи в файл:");

            // Запсисываем в поток fout из массива байтов buffer начиная со смещения 0 и до конца
            fout.write(buffer, 0, buffer.length);

            // Читаем и массив байтов, пр
            for (int i : buffer) {
                System.out.print((char)i);
            }
            System.out.println("\nФайл записан успшено.\n");

            System.out.println(finp.available() + " байт для чтения из файла:");
            finp.read(buffer, 0, finp.available());
            for (int i : buffer) {
                System.out.print((char)i);
            }
            System.out.println("\nФайл прочтен успшено.\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
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
 */