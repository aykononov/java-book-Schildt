package Chapter09.pkg02;

class MainDemo {
    public static void main (String[] args) {
        Protection2  pOb = new Protection2();
        OtherPackage oOb = new OtherPackage();
    }
}
/* -------------------------------------------
Контсруктор базового класса Protection
n = 1
n_priv = 2
n_prot = 3
n_publ = 4

Конструктор, унаследованный из другого пакета
n_prot = 3
n_publ = 4

Контсруктор базового класса Protection
n = 1
n_priv = 2
n_prot = 3
n_publ = 4

Конструктор из другого пакета pkg02
n_publ = 4
 */