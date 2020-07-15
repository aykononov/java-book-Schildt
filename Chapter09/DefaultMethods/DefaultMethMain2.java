package Chapter09.DefaultMethods;

// В этом классе предоставляются реализации обоих методов
class MyIFImp2 implements MyIF {
    // реализация метода
    public int getNumber() {
        System.out.print("Объект типа int возвращает: ");
        return 1;
    }

    // переопределение метода по умолчанию
    public String getString() {
        return "Объект типа String по умолчанию - переопределен!";
    }
}
class DefaultMethMain2 extends MyIFImp2 {
    public static void main (String[] args) {
        MyIFImp2 obj = new MyIFImp2();
        System.out.println(obj.getNumber());
        System.out.println(obj.getString());
    }
}
