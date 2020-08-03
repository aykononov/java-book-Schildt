package Chapter10;

// Пример, метод вычисления факториала throws
class ThrowsFactorial {
    static int getFactorial(int num) throws Exception {
        if (num < 1) throw new Exception("Число меньше 1");
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            getFactorial(-6);
            System.out.println(getFactorial(-6));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
/* -----------
Число меньше 1
 */