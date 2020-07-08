package Chapter09.pkg02;

class OtherPackage {
    OtherPackage() {
        Chapter09.pkg01.Protection pkgObject02 = new Chapter09.pkg01.Protection();
        System.out.println("Конструктор из другого пакета pkg02");

        //ОШИБКА!!! доступно только для данного класса Protection или пакета pkg01
        //System.out.println("n = " + pkgObject02.n);
        //ОШИБКА!!! доступно только для данного класса Protection
        //System.out.println("n_priv = " + pkgObject02.npriv);
        //ОШИБКА!!! доступно только для данного класса Protection, подкласса Derived или пакета pkg01
        //System.out.println("n_priv = " + pkgObject02.npriv);

        System.out.println("n_publ = " + pkgObject02.n_publ);

    }
}
