package Chapter17.Package02;

// Продемонстрировать применение метода append()

class AppendDemo {
    public static void main(String[] args) {
        String str;
        int a = 88;
        StringBuffer strBuf = new StringBuffer();
        str = strBuf.append("a = ").append(a).append("!").toString();
        System.out.println(str);
    }
}
/*-----
a = 88!
 */