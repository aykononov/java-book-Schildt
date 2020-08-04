package Chapter13.Package01;

// Продемонстрировать применение класса PrintWriter
import java.io.*;

class PrintWriterDemo {
    public static void main(String[] args) {
        PrintWriter pw =new PrintWriter(System.out, true);
        pw.println("Это строка");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
/* -------
Это строка
-7
4.5E-7
 */