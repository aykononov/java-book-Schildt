package Chapter11.Package00;

// Управление главным потоком исполнения
class CurrentThreadDemo {
    public static void main (String[] args) {
        // Ссылка на текущий (Главный) поток исполнения сохраняется в переменной t
        Thread t = Thread.currentThread();
        System.out.println("Teкyщий поток исполнения: " + t);

        // вызывается метод setName(), что бы изменить имя потока исполнения
        t.setName("MyThread");
        System.out.println("Пocлe изменения имени потока: " + t);

        // Метод sleep() из класса Тhrеаd может сгенерировать исключение типа InterruptException,
        // если в каком-нибудь другом потоке исполнения потребуется прервать ожидающий поток.
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Главный поток исполнения прерван");
        }
    }
}
/* ----------------------------------------------------
Teкyщий поток исполнения: Thread[main,5,main]
Пocлe изменения имени потока: Thread[MyThread,5,main]
5
4
3
2
1
 */