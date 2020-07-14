package Chapter09.Interfaces;

class Client implements Callback {
    // реализовать интерфейс Callback с модификатором доступа public !!!
    public void callback(int p) {
        System.out.println("Метод callback(), вызываемый со значением " + p);
    }

    // реализация собственного метода
    void nonIntfaceMeth() {
        System.out.println("В класса реализующих интерфейсы, также могут определятся и другие члены.");
    }
}
