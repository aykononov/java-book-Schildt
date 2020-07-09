package Chapter03;
// Продемонстрировать область видимости блока кода
public class Scope {
    public static void main(String[] args) {
        int x;
        x = 10;
        if(x == 10) {
            int y = 20;
            System.out.println("x , y: " + x + " , " + y);
            x = y * 2;
        }
        x = 100;
        System.out.println(x);
    }
}
/*
x , y: 10 , 20
100
 */