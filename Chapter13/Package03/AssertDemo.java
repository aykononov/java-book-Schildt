package Chapter13.Package03;

// Продемонстрировать применение оператора assert
class AssertDemo {
    static int val = 3;

    // возвратить целочисленное значение
    static int getnum() {
        return val--;
    }

    public static void main(String[] args) {
        int n;

        for (int i = 0; i < 10; i++) {
            n = getnum();
            assert n > 0 : " n - отрицаетльоне!!! "; // не подтвердится, если n == О
            System.out.println("n равно " + n);
        }
    }
}
/*
Чтобы разрешить проверку утверждений во время выполнения, следует указать параметр -еа в командной строке.
java -еа AssertDemo

---------------------------------
n равно 3
n равно 2
n равно 1
Exception in thread "main" java.lang.AssertionError:  n - отрицаетльоне!!!
        at Chapter13.Package03.AssertDemo.main(AssertDemo.java:17)
 */