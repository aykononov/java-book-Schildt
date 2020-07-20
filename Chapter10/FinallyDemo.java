package Chapter10;

// Продемонстрировать применение оператора finally
class FinallyDemo {

    // сгенерировать исключение в методе
    static void procA() {
        try {
            System.out.println("B теле метода procA()");
            throw new RuntimeException("демонстрация");
        } finally {
            System.out.println("Блок оператора finally в методе procA()");
        }
    }

    // возвратить управление из блока оператора try
    static void procB() {
        try {
            System.out.println("B теле метода procB()");
            return;
        } finally {
            System.out.println("Блок оператора finally в методе procB()");
        }
    }

    // выполнить блок try, как обычно
    static void procC() {
        try {
            System.out.println("B теле метода procC()");
        } finally {
            System.out.println("Блок оператора finally в методе procC()");
        }
    }

    public static void main(String[] args) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено");
        }

        procB();
        procC();
    }
}

/*
В данном примере выполнение метода procA() преждевременно прерывается
в блоке оператора try, где генерируется исключение, но блок оператора finally все равно выполняется.
Выход из блока оператора try в методе procB() происходит через оператор return, а блок оператора finally
выполняется перед возвратом из метода procB().
В методе procC() блок оператора try выполняется обычным образом, когда ошибки отсутствуют,
но блок оператора finally выполняется все равно.
------------------------------------
B теле метода procA()
Блок оператора finally в методе procA()
Исключение перехвачено
B теле метода procB()
Блок оператора finally в методе procB()
B теле метода procC()
Блок оператора finally в методе procC()
 */