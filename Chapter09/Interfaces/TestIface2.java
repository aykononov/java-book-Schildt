package Chapter09.Interfaces;
// Пример программы демонстрирует полиморфные возможности
class TestIface2 {
    public static void main(String[] args) {
        Callback c = new Client();
        Client2 ob = new Client2();

        c.callback(42);

        c = ob; // теперь переменная c ссылается на объект ob типа Client2
        c.callback(3);

    }
}
/* -----------------------------------------
Метод callback(), вызываемый со значением 42
Еще один вариант метода callback()
p в квадрате = 9
 */