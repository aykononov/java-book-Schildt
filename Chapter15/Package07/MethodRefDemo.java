package Chapter15.Package07;

// Продемонстрировать ссылку на статический метод

// Функциональный интерфейс для операций над символьными строками
interface StringFunc {
    String func(String n);
}

// В этом классе определяется статический метод strReverse()
class MyStringOps {
    // Статический метод, изменяющий порядок следования символов в строке
    static String strReverse(String str) {
        String result = "";

        for (int i = str.length()-1; i >= 0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo {
    // В этом методе функциональный интерфейс
    // указывается в качестве типа первого его параметра.
    // Следовательно, ему может быть передан любой экземпляр
    // данного интерфейса, включая и ссылку на метод.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Это исходная строка";
        String outStr;

        // Здесь ссылка на метод strReverse() передается методу stringOp()
        outStr = stringOp(MyStringOps::strReverse, inStr);

        System.out.println(inStr + " : обращенная строка будет : " + outStr);
    }
}
/*
Особое внимание в следующей строке кода:

    outStr = stringOp(MyStringOps::strReverse, inStr);

Здесь ссылка на статический метод strReverse(), объявляемый в классе MyStringOps,
передается первому аргументу метода stringOp(). Это вполне допустимо, поскольку метод strReversе()
совместим с функциональным интерфейсом StringFunс. Следовательно, в выражении МуStringОрs::strReverse
вычисляется ссылка на объект того класса, в котором метод strReverse() предоставляет реализацию метода func()
из функционального интерфейса StringFunc.
Вывод в консоль:
-------------------------------------------------------------------
Это исходная строка : обращенная строка будет : акортс яандохси отЭ
 */