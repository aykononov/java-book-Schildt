package Chapter12.Package05;
// В этом примере рефлексия применяется для вывода аннотации, связанной с конкретным методом

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Объявление типа аннотации
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}

class Meta {
   // аннотировать метод
   @MyAnno(str = "Пример аннотации", val = 100)
   public static void myMeth() {
       Meta ob = new Meta();

       // получить аннотацию из метода и вывести значения ее членов
       try {
           // сначала получить объект типа Class, представляющий данный класс
           Class<?> c = ob.getClass();

           // затем получить объект типа Method, представляющий данный метод
           Method m = c.getMethod("myMeth");

           // далее получить аннотацию для данного класса
           MyAnno anno = m.getAnnotation(MyAnno.class);

           // и наконец, вывести значения членов аннотации
           System.out.println(anno.str() + " " + anno.val());

       } catch (NoSuchMethodException e) {
           System.out.println("Meтoд не найден.");
       }
   }

    public static void main(String[] args) {
        myMeth();
    }
}
/* -----------------
Пример аннотации 100

В этой программе рефлексия применяется, как описано выше, для получения и вывода значений переменных str и val из аннотации MyAnno,
связанной с методом myMeth() из класса Meta. Здесь следует обратить особое внимание на следующее.
Во-первых, это выражение MyAnno.class в следующей строке кода:

  MyAnno anno = m.getAnnotation(MyAnno.class);

Это выражение вычисляется как объект Class, относящийся к типу MyAnno, т.е. к искомой аннотации, и называется литералом класса.
Такое выражение можно использовать всякий раз, когда требуется объект Class известного класса.

Во-вторых, это способ получения значений, связанных с переменными str и val, когда они выводятся в следующей строке кода:

  System.out.println(anno.str() + " " + anno.val());

Обратите внимание на то, что для обращения к ним применяется синтаксис вызова методов.
Тот же самый подход применяется всякий раз, когда требуется получить член аннотации.
 */