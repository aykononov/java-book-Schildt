package Chapter15.Package04;
//Передать лямбда-выражение в качестве аргумента вызываемому методу
interface StringFunc {
    String getFunc(String n);
}

class LambdasAsArgumentsDemo {
    // Первый параметр этого метода имеет тип функционального интерфейса.
    // Ему можно передать ссылку на любой экземпляр этого интерфейса,
    // включая экземпляр, создаваемый в лямбда-выражении.
    // Второй параметр обозначает обрабатываемую символьную строку.
    static String stringOp(StringFunc sf, String s) {
        return sf.getFunc(s);
    }

    public static void main(String[] args) {
        String inStr = ("Строка С Пробелами");
        String outStr;
        System.out.println("Это исходная строка: " + inStr);

        // Лямбда-выражение, преобразующее в прописные все буквы
        // в исходной строке, передаваемой методу stringOp()
        outStr = stringOp((str) -> str.toUpperCase(), inStr);
        System.out.println("Строка прописными буквами: " + outStr);

        // Блочное лямбда-выражение, удаляет пробелы из исходной символьной строки
        outStr = stringOp((str) -> {
          String result = "";
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != ' ') {
                    result += str.charAt(i);
                }
            } return result;
        }, inStr);
        System.out.println("Cтрока с удаленными пробелами: " + outStr);

        // Передать экземпляр функционального интерфейса StringFunc,
        // созданный в предыдущем лямбда-выражении.
        // После следующего объявления ссылка reverse делается на
        // экземпляр интерфейса StringFunc
        StringFunc reverse = (str) -> {
            String result = "";
            for (int i = str.length()-1; i >= 0 ; i--) {
                result += str.charAt(i);
            }
            return result;
        };

        // Теперь ссылку reverse можно передать в качестве первого параметра
        // методУ stringOp(), поскольку она делается на объект типа StringFunc
        System.out.println("Этo обращенная строка: " + stringOp(reverse, inStr));
    }
}
/* --------------------------------------------
Это исходная строка: Строка С Пробелами
Строка прописными буквами: СТРОКА С ПРОБЕЛАМИ
Cтрока с удаленными пробелами: СтрокаСПробелами
Этo обращенная строка: ималеборП С акортС
 */