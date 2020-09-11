package Chapter16.demo.appsrc.appfunc.appfunc.simplefunc;

public class SimpleMathFuncs {
    // Метод определяет, является ли a множителем b
    public static boolean isFactor(int a, int b) {
        if ((b % a) == 0) return true;
        return false;
    }

    // Метод возвращает наименьший общий положительный множитель для a и b
    public static int lcf(int a, int b) {
        // получить абсолютные значения
        a = Math.abs(a);
        b = Math.abs(b);
        int min = a < b ? a : b;
        for (int i = 2; i <= min / 2; i++) {
            if(isFactor(i, a) && isFactor(i, b)) return i;
        }
        return 1;
    }

    // Метод возвращает наибольший общий положительный множитель для a и b
    public static int hcf(int a, int b) {
        // получить абсолютные значения
        a = Math.abs(a);
        b = Math.abs(b);
        int max = a < b ? a : b;
        for (int i = max / 2; i >= 2  ; i--) {
            if (isFactor(i, a) && isFactor(i, b)) return i;
        }
        return 1;
    }
}
