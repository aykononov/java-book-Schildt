package Chapter14.Package02;

// Класс NonGen - функциональный эквивалент класса Gen без обобщений
class NonGen {
    Object ob; //объект оb теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object
    NonGen(Object o) {
        ob = o;
    }

    // возвратить тип Object
    Object getOb() {
        return ob;
    }

    // показать тип объекта оb
    void showType() {
        System.out.println("Oбъeкт оb относится к типу: " + ob.getClass().getName());
    }
}

// Продемонстрировать необобщенный класс
class NonGenDemo {
    public static void main(String[] args) {
        NonGen iOb;

        // создать объект типа NonGen и сохранить в нем
        // объект типа Integer. Выполняется автоупаковка
        iOb = new NonGen(12345678);

        // показать тип данных, хранящихся в переменной iOb
        iOb.showType();

        // получить значение переменной iOb, на этот раз требуется приведение типов
        int v = (Integer) iOb.getOb();
        System.out.println("Значение: " + v);
        System.out.println();

        // создать другой объект типа NonGen и
        // сохранить в нем объект типа String
        NonGen sOb = new NonGen("текстовая строка");

        // показать тип данных, хранящихся в переменной sOb
        sOb.showType();

        // получить значение переменной strOb, и в этом случае потребуется приведение типов
        String str = (String) sOb.getOb();
        System.out.println("Значение: " + str);

        // Этот код компилируется, но он принципиально неверный!!!
        iOb = sOb;
        v = (Integer) iOb.getOb(); // Ошибка!!! во время выполнения.
    }
}
/* -----------------------------------------
Oбъeкт оb относится к типу: java.lang.String
Значение: текстовая строка
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at Chapter14.Package02.NonGenDemo.main(NonGenDemo.java:53)

 */