package Chapter13.Package02;
/*
Версия программы CopyFile, в которой демонстрируется
применение оператора try с ресурсами и управление
двумя ресурсами (в данном случае - файлами) в одном операторе try
*/
import java.io.*;

class CopyFileAutoClose {
    public static void main(String[] args) throws IOException {
        int i;

        // Проверяем, что указаны имена обоих файлов
        if (args.length != 2) {
            System.out.println("Не указаны имена файлов: откуда куда");
            return;
        }

        // открыть два файла и управлять ими в операторе try
        try (FileInputStream fin = new FileInputStream(args[0]);
             FileOutputStream fout = new FileOutputStream(args[1])) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
