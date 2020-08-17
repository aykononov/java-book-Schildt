package Chapter09.pkg01;

// получить экземпляры различных классов из пакета pkg01
class MainDemo {
    public static void main (String[] args) {
        Protection  pOb = new Protection();
        Derived     dOb = new Derived();
        SamePackage sOb = new SamePackage();
    }
}
/* ------------------------------------
Контсруктор базового класса Protection
n = 1
n_priv = 2
n_prot = 3
n_publ = 4

Контсруктор базового класса Protection
n = 1
n_priv = 2
n_prot = 3
n_publ = 4

Конструктор подкласса Derived
n = 1
n_prot = 3
n_publ = 4

Контсруктор базового класса Protection
n = 1
n_priv = 2
n_prot = 3
n_publ = 4

Конструктор из того же самого пакета
n = 1
n_prot = 3
n_publ = 4
 */