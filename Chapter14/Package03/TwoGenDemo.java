package Chapter14.Package03;

// Простой обобщенный класс с двумя параметрами типа: Т и V
class TwoGen<T,V> {
    T ob1;
    V ob2;

    // передать конструктору ссылки на объекты типа T и V
    TwoGen(T o1, V o2) {
        ob1 = o1;
        ob2 = o2;
    }

    // показать типы Т и V
    void showType() {
        System.out.println("Тип T: " + ob1.getClass().getName());
        System.out.println("Тип V: " + ob2.getClass().getName());
    }

    T getOb1() {
        return ob1;
    }

    V getOb2() {
        return ob2;
    }
}

// продемонстрировать применение класса ТWoGen
class TwoGenDemo {
    public static void main(String[] args) {
        TwoGen<Integer, String> tgObj = new TwoGen<Integer, String>(12345678,"текстовая строка");

        // показать типы
        tgObj.showType();

        // Получить и показать значения
        int v = tgObj.getOb1();
        System.out.println("Значение: " + v);

        String str = tgObj.getOb2();
        System.out.println("Значение: " + str);
    }
}
/* -----------------------
Тип T: java.lang.Integer
Тип V: java.lang.String
Значение: 12345678
Значение: текстовая строка
 */