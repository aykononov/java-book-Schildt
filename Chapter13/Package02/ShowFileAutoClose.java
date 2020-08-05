package Chapter13.Package02;
/*
В этой версии программы ShowFile
оператор try с ресурсами применяется
для автоматического закрытия файла
*/
import java.io.*;

class ShowFileAutoClose {
    public static void main(String[] args) {
        int i;

        // Проверяем, что указано имя файла
        if (args.length != 1) {
            System.out.println("Не указано: имя_файла");
            return;
        }

        // оператор try с ресурсами применяется сначала для открытия,
        // а затем для автоматического закрытия файла по завершении блока этого оператора
        try (FileInputStream fin = new FileInputStream(args[0])) {
            do {
                i = fin.read();
                if (i != -1) System.out.print((char) i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
