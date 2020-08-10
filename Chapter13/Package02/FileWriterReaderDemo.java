package Chapter13.Package02;

// Записать текст в файл и прочитать
import java.io.*;
import java.util.*;

class FileWriterReaderDemo {
    public static void main(String[] args) {
        String text = "Test\n1234"; // Входящая строка символов
        String path = "./Chapter13/"; // Путь к файлу
        String file = "FileWriter.txt"; // Имя файла
        String filecopy = "FileWriterCopy.txt"; // Копия файла

        // Чтение посимвольно
        try (FileWriter wfile = new FileWriter(path + file);
             FileReader rfile = new FileReader(path + file) ) {

            System.out.println("Прочитано " + text.length() + " символов для записи.");
            wfile.append(text); // запись в файл
            wfile.flush(); // сбросить поток
            System.out.println("Файл создан, " + text.length() + " символов записано успешно.\n");

            System.out.println("Читаем посимвольно.");
             int c;
             while ((c = rfile.read()) != -1) {
                 System.out.print((char)c);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Также мы можем считывать в промежуточный буфер из массива символов
        /* В данном случае считываем последовательно символы из файла в массив из 256 символов,
           пока не дойдем до конца файла в этом случае метод read возвратит число -1.

           Поскольку считанная порция файла может быть меньше 256 символов (например, в файле всего 73 символа),
           и если количество считанных данных меньше размера буфера (256), то выполняем копирование массива
           с помощью метода Arrays.copy. То есть фактически обрезаем массив buf, оставляя в нем только те символы,
           которые считаны из файла.
         */
        try (FileReader reader = new FileReader(path + file)) {
            System.out.println("\n");
            System.out.println("Считываем в промежуточный буфер.");
            //char[] buffer = new char[text.length()];
            char[] buffer = new char[256];
            int b;
            while ((b = reader.read(buffer)) > 0) {
                if (b < 256) {
                    buffer = Arrays.copyOf(buffer, b);
                }
                System.out.print(buffer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Чтение построчно
        try (FileReader rfile = new FileReader(path + file);
                Scanner scan = new Scanner(rfile)) {
            System.out.println("\n");
            System.out.println("Читаем по строкам.");
            int i = 1;
            while (scan.hasNextLine()) {
                System.out.println(i + " строка: " + scan.nextLine());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
/*
Прочитано 9 символов для записи.
Файл создан, 9 символов записано успешно.

Читаем посимвольно.
Test
1234

Считываем в промежуточный буфер.
Test
1234

Читаем по строкам.
1 строка: Test
2 строка: 1234
 */