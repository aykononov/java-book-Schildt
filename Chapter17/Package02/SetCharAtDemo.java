package Chapter17.Package02;

// Демонстрация методов charAt() и setCharAt()

class SetCharAtDemo {
    public static void main(String[] args) {
        StringBuffer strBuf = new StringBuffer("Hello");
        System.out.println("Бyфep: " + strBuf);
        System.out.println("дo вызова charAt(1): " + strBuf.charAt(1));
        strBuf.setCharAt(1, 'i');
        strBuf.setLength(2);
        System.out.println("Бyфep после: " + strBuf);
        System.out.println("после вызова charAt(1): " + strBuf.charAt(1));

    }
}
/* -----------------------
Бyфep: Hello
дo вызова charAt(1): e
Бyфep после: Hi
после вызова charAt(1): i
 */