package Chapter17.Package01;

class MakeString {
    public static void main(String[] args) {
        char[] chrs = {'J','a','v','a'};
        String s = new String(chrs);
        String c = new String(s);
        System.out.println(s);
        System.out.println(c);
    }
}
/* -------
Java
Java
 */