package Chapter11.Package08;

// Правильная реализация поставщика и потребителя
class Q {
    int n;
    boolean valueSet;

    synchronized int get() {
        while (!valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException перехвачено");
            }
        System.out.println("Получено: " + n);
        valueSet = false;
        notify();
        return n;
    }

    synchronized void put(int n) {
        while (valueSet)
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Иcключeниe типа InterruptedException перехвачено");
            }
        this.n = n;
        valueSet = true;
        System.out.println("Отправлено: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Поставщик").start();
    }
    public void run() {
        int i = 0;
        while (i < 10) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;

    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Потребитель").start();
    }
    public void run() {
        while (true) {
            q.get();
        }
    }
}

class PCFixed {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}
/*
  В методе get() вызывается метод wait(). В итоге исполнение потока приостанавливается до тех пор,
пока объект класса Producer не уведомит, что данные прочитаны.
Когда это произойдет, исполнение потока в методе get() возобновится.
Как только данные будут получены, в методе get() вызывается метод notify().
Этим объект класса Producer уведомляется, что все в порядке и в очереди можно
разместить следующий элемент данных. Метод wait() приостанавливает исполнение потока в методе put() до тех пор,
пока объект класса Consumer не извлечет элемент из очереди. Когда исполнение потока возобновится, следующий элемент
данных размещается в очереди и вызывается метод notify(). Этим объект класса Consumer уведомляется,
что теперь он может извлечь элемент из очереди.

-----------------------------------
Отправлено: 0
Получено: 0
Отправлено: 1
Получено: 1
Отправлено: 2
Получено: 2
Отправлено: 3
Получено: 3
Отправлено: 4
Получено: 4
Отправлено: 5
Получено: 5
Отправлено: 6
Получено: 6
Отправлено: 7
Получено: 7

 */