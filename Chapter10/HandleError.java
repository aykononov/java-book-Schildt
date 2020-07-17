package Chapter10;
import java.util.Random;

//  Обработать исключение и продолжить работу
class HandleError {
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            try {
                b = r.nextInt();
                c = r.nextInt();
                a = 12 / (b / c);
            } catch (ArithmeticException e) {
                System.out.println("Деление на нуль.");
                a = 0; // присвоить нуль и продолжить работу
            }
            System.out.println("a= " + a);
        }
    }
}
/* -------------
Деление на нуль.
a= 0
a= 6
Деление на нуль.
a= 0
Деление на нуль.
a= 0
a= 6
a= 6
Деление на нуль.
a= 0
Деление на нуль.
a= 0
a= -12
a= 12
 */