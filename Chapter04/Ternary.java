package Chapter04;
//Продемонстрировать применение тернарной операции ?
public class Ternary {
    public static void main(String[] args) {
        System.out.println("Применение тернарной операции ?\n");
        int i,k;

        i = 10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i;
        System.out.println("Абсолютное значение " + i + " равно " + k);

        i = -10;
        k = i < 0 ? -i : i; // получить абсолютное значение переменной i;
        System.out.println("Абсолютное значение " + i + " равно " + k);
    }
}
