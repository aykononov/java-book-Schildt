package Chapter09.Interfaces;

class Client implements Callback {
    // реализовать интерфейс Callback обязательно с модификатором доступа public !!!
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    // реализация собственного метода
    void nonIntfaceMeth() {
        System.out.println("В классах реализующих интерфейсы, также могут определяться и другие члены.");
    }
}
