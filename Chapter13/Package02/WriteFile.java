package Chapter13.Package02;
// Пример записи строки в файл TEST.txt
import java.io.*;
class WriteFile {
    public static void main(String[] args) {
        // Строка для чтения
        String text = "Первая строка.\n" +
                      "Вторая строка.\n" +
                      "1234567890";

        // Для автоматического закрытия файла и освобождения ресурса объект создается с помощью данной конструкции
        try (FileOutputStream fos = new FileOutputStream(".//Chapter13//Package02//Test.txt")) {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Файл записан.");
    }
}
