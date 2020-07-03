// Продемонстрировать некоторые методы из класса String
        package Chapter07;

public class StringDemo14 {
    public static void main(String[] args) {
        String strOb1 = "ПерваЯ строка";
        String strOb2 = "Вторая строка";
        String strOb3 = strOb1;

        System.out.println("Длина строки strOb1: " + strOb1.length());
        System.out.println("Символ по индексу 5 " +
                            "в строке strOb1: " +
                            strOb1.charAt(5));
        if (strOb1.equals(strOb2))
            System.out.println("strOb1 == strOb2");
        else
            System.out.println("strOb1 != strOb2");

        if (strOb1.equals(strOb3))
            System.out.println("strOb1 == strOb3");
        else
            System.out.println("strOb1 != strOb3");
    }
}

/*
------------------------
Длина строки strOb1: 13
Символ по индексу 5 в строке strOb1: Я
strOb1 != strOb2
strOb1 == strOb3

 */