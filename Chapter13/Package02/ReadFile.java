package Chapter13.Package02;
// Чтение файлов и класс FileInputStream
import java.io.*;
class ReadFile {
    public static void main(String[] args) {

        // Для автоматического закрытия файла и освобождения ресурса объект создается с помощью данной конструкции
        try (FileInputStream fin = new FileInputStream(".//Chapter13//Package02//Test.txt")) {

            System.out.println("File size: %d bytes \n" + fin.available());

            // Считываем каждый отдельный байт в переменную i
            int i = -1;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
