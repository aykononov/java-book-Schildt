package Chapter10;

class SuperSubCatch2 {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 10 / a;
        }

        /* Теперь Этот оператор catch будет достигнут,
           так как подкласс ArithmeticException является
           производным от класса Exception и стоит впереди него */
         catch (ArithmeticException e) {
            System.out.println("Этoт код выполнится!!!");
         }

        catch (Exception e) {
            System.out.println("Перехват исключений общего класса Exception.");
        }
    }
}
