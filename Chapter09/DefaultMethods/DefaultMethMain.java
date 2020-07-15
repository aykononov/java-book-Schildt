package Chapter09.DefaultMethods;

// Пример использования реализации метода по умолчанию

interface MyIF {
    // Это обычный метод
    int getNumber();

    // Метод с реализацией по умолчанию - он просто возвращает символьную строку
    default String getString() {
        return "Объект типа String по умолчанию";
    }
}

// Реализовать интерфейс MyIF
class MyIFImp1 implements MyIF {
    public int getNumber() {
        System.out.print("Объект типа int возвращает: ");
        return 0;
    }
}

// Использовать метод с реализацией по умолчанию
class DefaultMethMain extends MyIFImp1 {
    public static void main(String[] args) {
        MyIFImp1 obj = new MyIFImp1();

        System.out.println(obj.getNumber());

        // Для вызова метода по умолчанию, его не нужно реализовывать в классе MyIFImp
        System.out.println(obj.getString());
    }
}
/* ---------------------------
Объект типа int возвращает: 0
Объект типа String по умолчанию
 */