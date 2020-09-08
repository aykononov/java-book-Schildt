package Chapter15.Package03;

// Пример обобщенного функционального интерфейса с разнотипными Лямбда-выражениями

// Обобщенный функциональный интерфейс
interface SomeFunc<T> {
    T getFunc(T t);
}

class GenericFunctionalinterfaceDemo {
    public static void main(String[] args) {
        // использовать строковый вариант функционального интерфейса SomeFunc
        SomeFunc<String> reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0; i--) {
                result += str.charAt(i);
            }
            return result;
        };
        System.out.println("Лямбдa обращается на :" + reverse.getFunc("Лямбдa"));
        System.out.println("Bыpaжeниe обращается на :" + reverse. getFunc ( "Выражение" ));

        // использовать целочисленный вариант функционального интерфейса SomeFunc
        SomeFunc<Integer> factorial = (n) -> {
            int result = 1;
            for (int i = 1; i <= n ; i++) {
                result = result * i;
            }
            return result;
        };
        System.out.println("Факториал числа 3 равен: " + factorial.getFunc(3));
        System.out.println("Факториал числа 5 равен: " + factorial.getFunc(5));
    }
}
/* ------------------------------
Лямбдa обращается на aдбмяЛ
Bыpaжeниe обращается на еинежарыВ
Факториал числа 3 равен: 6
Факториал числа 5 равен: 120

 */