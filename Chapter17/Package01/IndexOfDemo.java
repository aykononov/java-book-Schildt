package Chapter17.Package01;

// Продемонстрировать применение разных форм методов indexOf() и lastindexOf()

class IndexOfDemo {
    public static void main(String[] args) {
        String str = "Now is the time for all good men to come to the aid of their country.";
        System.out.println("Исходная строка: " + str);
        System.out.println("Метод indexOf(t): " + str.indexOf('t'));
        System.out.println("Метод lastindexOf(t): " + str.lastIndexOf('t'));
        System.out.println("Метод indexOf(the): " + str.indexOf("the"));
        System.out.println("Метод lastindexOf(the): " + str.lastIndexOf("the"));
        System.out.println("Метод indexOf(t, 10): " + str.indexOf('t', 10));
        System.out.println("Метод lastindexOf(t, 60): " + str.lastIndexOf('t', 60));
        System.out.println("Метод indexOf(the, 10): " + str.indexOf("the", 10));
        System.out.println("Метод lastindexOf(the, 60): " + str.lastIndexOf("the", 60));

    }
}
/* -----------------------------------------------------------------------------------
Исходная строка: Now is the time for all good men to come to the aid of their country.
Метод indexOf(t): 7
Метод lastindexOf(t): 65
Метод indexOf(the): 7
Метод lastindexOf(the): 55
Метод indexOf(t, 10): 11
Метод lastindexOf(t, 60): 55
Метод indexOf(the, 10): 44
Метод lastindexOf(the, 60): 55
 */