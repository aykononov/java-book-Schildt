package Chapter13.Package02;
// Пример чтение из одного и запись в другой файл
import java.io.*;
public class ReadWriteFile {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream(".//Chapter13//Package02//Test.txt");
            FileOutputStream fos=new FileOutputStream(".//Chapter13//Package02//Test2.txt"))
        {
            byte[] buffer = new byte[fin.available()];
            // считываем буфер
            fin.read(buffer, 0, buffer.length);
            // записываем из буфера в файл
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}