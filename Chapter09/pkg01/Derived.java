package Chapter09.pkg01;

class Derived extends Protection {
    Derived() {
        System.out.println("Конструктор подкласса Derived");
        System.out.println("n = " + n);

        //ОШИБКА!!! Доступен только для класса Protection
        //System.out.println("n_priv = " + n_priv);

        System.out.println("n_prot = " + n_prot);
        System.out.println("n_publ = " + n_publ);
    }
}
