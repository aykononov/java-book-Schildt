package Chapter17.Package02;

// Демонстрация методов length() и capacity() из класса StringBuffer

class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Строка");
        System.out.println("Содержимое буфера: " + strBuf);
        System.out.println("Текущая длина объекта: " + strBuf.length());
        System.out.println("Объем выделенной памяти: " + strBuf.capacity());
    }
}
/*
Длина буфера равна (6), а объем выделяемой памяти (22),
поскольку (16) дополнительных символов добавляются автоматически.
-----------------------------------------------------------------
Содержимое буфера: Строка
Текущая длина объекта: 6
Объем выделенной памяти: 22
 */