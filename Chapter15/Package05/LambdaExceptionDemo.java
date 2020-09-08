package Chapter15.Package05;

import java.util.Arrays;

// Сгенерировать исключение из лямбда-выражения
interface DoubleNumericArrayFunc {
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception {
    EmptyArrayException() {
        super("Пустой массив");
    }
}

class LambdaExceptionDemo {
    public static void main(String[] args) throws EmptyArrayException {
        double[] values = {1.0, 2.0, 3.0, 4.0};

        // лямбда-выражение вычисляет среднее числовых значений типа double в массиве
        DoubleNumericArrayFunc average = (n) -> {
          double sum = 0;

          if (n.length == 0) {
              throw new EmptyArrayException();
          }

          for (int i = 0; i < n.length; i++) {
              sum += n[i];
          }

          return sum / n.length;
        };

        System.out.println("Среднее значение равно " + average.func(values));

        // Здесь при вызове метода передается массив нулевой длины,
        // что приводит к генерированию исключения типа EmptyArrayException
        System.out.println("Среднее значение равно " + average.func(new double[0]));
    }
}
/*
Среднее значение равно 2.5

Exception in thread "main" Chapter15.Package05.EmptyArrayException: Пустой массив
	at Chapter15.Package05.LambdaExceptionDemo.lambda$main$0(LambdaExceptionDemo.java:25)
	at Chapter15.Package05.LambdaExceptionDemo.main(LambdaExceptionDemo.java:36)
 */