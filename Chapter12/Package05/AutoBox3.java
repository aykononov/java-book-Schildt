package Chapter12.Package05;
// Автоупаковка/распаковка значений из классов Boolean и Character
class AutoBox3 {
    public static void main(String[] args) {
        // Автоупаковка/распаковка логического значения типа boolean
        Boolean b = true;

        // Объект типа Boolean автоматически распаковывается,
        // когда он употребляется в условном операторе if.
        if (b) System.out.println("b равно: " + b);

        // Автоупаковка/распаковка значения типа char
        Character ch = 'x'; // упаковать значение типа char
        char ch2 = ch; // распаковать значение типа char
        System.out.println("ch2 равно: " + ch2);
    }
}
/* ----------
b равно: true
ch2 равно: x

 */