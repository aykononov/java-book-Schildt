package Chapter15.Package09;

// Реализовать простую ФАБРИКУ классов, используя ссылку на конструктор

interface GenMyFunc<R, T> {
    R func(T n);
}
// Простой обобщенный класс
class GenMyClass<T> {
    private T val;

    // Конструктор, принимающий один параметр
    GenMyClass(T val) {
        this.val = val;
    }

    // Конструктор по умолчанию.
    // Этот конструктор в данной программе НЕ используется...
    GenMyClass () { this.val = null; }

    T getVal() {
        return this.val;
    }
}

// Простой Необобщенный класс
class MyClass2 {
    String str;

    // Конструктор, принимающий один аргумент
    MyClass2(String str) {
        this.str = str;
    }

    // Конструктор по умолчанию.
    // Этот конструктор в данной программе НЕ используется
    MyClass2() { this.str = ""; }

    String getStr() {
        return this.str;
    }
}

class FactoryConstructorRefDemo {
    // ФАБРИЧНЫЙ метод для объектов разных классов.
    // У каждого класса должен быть свой конструктор, принимающий один параметр типа Т.
    // А параметр R обозначает тип создаваемого объекта.
    static <R, T> R myClassFactory(GenMyFunc<R, T> constr, T v) {
        return constr.func(v);
    }

    public static void main(String[] args) {
        // Создадим ссылку на конструктор класса GenMyClass.
        // Здесь в операции new вызывается конструктор, принимающий аргумент
        GenMyFunc<GenMyClass<Double>, Double> myClassCons = GenMyClass<Double>::new;

        // Создадим экземпляр типа класса GenMyClass, используя ФАБРИЧНЫЙ метод
        GenMyClass<Double> mcOb = myClassFactory(myClassCons, 88.8);

        // Используем созданный экземпляр класса GenMyClass
        System.out.println("Значение val в объекте mcOb равно: " + mcOb.getVal());

        // Создадим экземпляр класса MyClass2, используя метод myClassFactory()
        GenMyFunc<MyClass2, String> myClassCons2 = MyClass2::new;

        // Создадим экземпляр класса MyClass2, используя ФАБРИЧНЫЙ метод
        MyClass2 mcOb2 = myClassFactory(myClassCons2, "Строку");

        // Используем созданный экземпляр класса MyClass2
        System.out.println("Значение str в объекте mcOb2 содержит: " + mcOb2.getStr());
    }
}
/* ------------------------------------------
Значение val в объекте mcOb равно: 88.8
Значение str в объекте mcOb2 содержит: Строку
 */