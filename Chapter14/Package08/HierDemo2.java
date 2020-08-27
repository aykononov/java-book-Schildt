package Chapter14.Package08;

// Необобщенный класс
class NonGen {
    int num;

    NonGen(int num) {
        this.num = num;
    }

    int getNum() {
        return this.num;
    }
}

// Обобщенный подкласс
class Gen<T> extends NonGen {
    T ob; //объявить объект типа Т

    // передать конструктору объект типа Т
    Gen(T o, int i) {
       super(i);
       ob = o;
    }

    // возвратить объект оЬ
    T getOb() {
        return ob;
    }
}

class HierDemo2 {
    public static void main(String[] args) {
        // создать объект типа Gen для символьных строк
        Gen<String> wOb = new Gen<String>("Значение: ", 99);
        System.out.print(wOb.getOb());
        System.out.println(wOb.getNum());
    }
}
/* ---------
Значение: 99
 */