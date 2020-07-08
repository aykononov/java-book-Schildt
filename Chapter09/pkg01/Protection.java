package Chapter09.pkg01;

public class Protection {
    int n = 1;
    private int n_priv = 2;
    protected int n_prot = 3;
    public int n_publ = 4;

    public Protection () {
        System.out.println("Контсруктор базового класса Protection");
        System.out.println("n = " + n);
        System.out.println("n_priv = " + n_priv);
        System.out.println("n_prot = " + n_prot);
        System.out.println("n_publ = " + n_publ);
    }
}
