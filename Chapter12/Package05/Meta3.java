package Chapter12.Package05;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Показать все аннотации для класса и метода

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {
    String description();
}

@What(description = "Аннотация тестового класса")
@MyAnno3(str = "Meta3", val = 99)
class Meta3 {
    @What(description = "Аннотация тестового метода")
    @MyAnno3(str = "Тест", val = 100)
    public static void myMeth() {
        Meta3 ob = new Meta3();

        try {
            Annotation annos[] = ob.getClass().getAnnotations();

            // вывести все аннотации для класса Meta3
            System.out.println("все аннотации для класса Meta3:");
            for (Annotation a : annos) System.out.println(a);
            System.out.println();

            // вывести все аннотации для метода myMeth()
            Method m = ob.getClass().getMethod("myMeth");
            annos = m.getAnnotations();
            System.out.println("все аннотации для метода myMeth():");
            for (Annotation a : annos) System.out.println(a);

        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}
/* --------------------------------------------------------------
все аннотации для класса Meta3:
@Chapter12.Package05.What(description=Аннотация тестового класса)
@Chapter12.Package05.MyAnno3(str=Meta3, val=99)

все аннотации для метода myMeth():
@Chapter12.Package05.What(description=Аннотация тестового метода)
@Chapter12.Package05.MyAnno3(str=Тест, val=100)


В этой программе метод getAnnotations() используется для получения массива всех аннотаций,
связанных с классом Meta3 и методом myMeth(). Метод getAnnotations() возвращает массив объектов типа Annotation.
Напомним, что Annotation является суперинтерфейсом для всех интерфейсов аннотаций
и что в нем переопределяется метод toString() из класса Object.
Так, если выводится ссылка на интерфейс Annotation, то вызывается его метод toString() для создания символьной строки,
описывающей аннотацию, что и демонстрирует предыдущий пример.
 */