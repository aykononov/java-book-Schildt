package Chapter15.Package08;

// Пример применения ссылки на метод экземпляра

// Функциональный интерфейс для операций над символьными строками
interface StringFunc {
    String func(String n);
}

// Класс, где определяется метод экземпляра strReverse()
class MyStringOps {
    String strReverse(String str) {
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}

class MethodRefDemo2 {
    // В этом методе функциональный интерфейс указывается в качестве типа первого его параметра.
    // Следовательно, ему может быть передан любой экземпляр этого интерфейса, включая и ссылку на метод.
    static String stringOp(StringFunc sf, String s) {
        return sf.func(s);
    }

    public static void main(String[] args) {
        String inStr = "Это исходная строка";
        String outStr;

        // Создаем объект типа MyStringOps
        MyStringOps strOps = new MyStringOps();

        // Здесь ссылка на метод экземпляра strReverse() передается методу stringOp()
        // Метод экземпляра strReverse() вызывается для объекта strOps
        outStr = stringOp(strOps::strReverse, inStr);

        System.out.println(inStr + " : обращенная строка будет : " + outStr);
    }
}
/*
Обратите внимание в данном примере программы на то, что метод strReverse()
теперь объявляется в классе MyStringOps как метод экземпляра.
А в теле метода main() создается экземпляр strOps класса MyStringOps.
Этот экземпляр служит для создания ссылки на свой метод strReverse()
при вызове метода stringOp().

Вывод в консоль:
-------------------------------------------------------------------
Это исходная строка : обращенная строка будет : акортс яандохси отЭ
 */