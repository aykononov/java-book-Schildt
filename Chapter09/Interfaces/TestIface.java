package Chapter09.Interfaces;
// Пример программы, где метод callback() вызывается через переменную ссылки на интерфейс
class TestIface {
    public static void main(String[] args) {
        Callback c = new Client();
        c.callback(42);
    }
}
/*

-----------------------------------------
Метод callback(), вызываемый со значением 42
 */