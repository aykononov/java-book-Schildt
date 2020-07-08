package Chapter09.pkg01;

class SamePackage {
    SamePackage() {
        Protection protObject = new Protection();
        System.out.println("Конструктор из того же самого пакета");
        System.out.println("n = " + protObject.n);

        //ОШИБКА!!! Доступен только для класса Protection
        //System.out.println("n_priv = " + protObject.n_priv);

        System.out.println("n_prot = " + protObject.n_prot);
        System.out.println("n_publ = " + protObject.n_publ);
    }
}
