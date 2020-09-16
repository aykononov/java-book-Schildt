package Chapter17.Package01;

// Пример демонстрирует Метод equals() в сравнении с операцией ==
class EqualsNotEqualTo {
    public static void main(String[] args) {
        String s1 = "Строка";
        String s2 = new String(s1);
        System.out.println(s1 + " равно " + s2 + " : " + s1.equals(s2));
        System.out.println(s1 + " == " + s2 + " : " + (s1 == s2));
    }
}
/*
Содержимое обоих объектов типа String одинаково, но это разные объекты.
--------------------------
Строка равно Строка : true
Строка == Строка : false
 */