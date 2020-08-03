package Chapter10;
/*
Пример неверно написанной программы, пытающейся сгенерировать исключение, которое в самой программе не перехватывается.
Эта программа не подлежит компиляции, поскольку в ней отсутствует оператор throws, в котором объявляется неперехватываемое исключение.

// Эта программа содержит ошибку, и поэтому она не подлежит компиляции
class ThrowsDemo {
    static void throwOne() {
        System.out.println("B теле метода throwOne()");
        throw new IllegalAccessException("дeмoнcтpaция");
    }
    public static void main(String args[J) {
           throwOne();
    }
 }

Чтобы эту программу можно было скомпилировать, в ее исходный код следует внести два изменения.
Во-первых, объявить в методе throwOne() генерирование исключения типа IllegalAccessException.
Во-вторых, определить в методе main() блок оператора try/catch для перехвата этого исключения.
Ниже приведен исправленный код данной программы.
 */

// Эта программа написана верно
class ThrowsDemo {
    static void throwOne() throws IllegalAccessException {
        System.out.println("В теле метода throwOne()");
        throw new IllegalAccessException("демонстрация");
    }

    public static void main(String[] args) {
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }
}
/* -------------------------------------------------------------------
В теле метода throwOne()
Перехвачено исключение: java.lang.IllegalAccessException: демонстрация
 */