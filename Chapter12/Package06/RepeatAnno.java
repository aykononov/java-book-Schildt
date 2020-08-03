package Chapter12.Package06;

// Продемонстрировать применение повторяющейся аннотации
import java.lang.annotation.*;
import java.lang.reflect.*;

// сделать аннотацию MyAnno повторяющейся
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(MyRepeatedAnnos.class)
@interface MyAnno {
    String str() default "Тестирование";
    int val() default 9000;
}

// Это контейнерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyRepeatedAnnos {
    MyAnno[] value();
}

class RepeatAnno {
    // повторить аннотацию MyAnno в методе myMeth()
    @MyAnno(str = "Первая аннотация", val = -1)
    @MyAnno(str = "Вторая аннотация", val = 100)
    public static void myMeth(String str, int i) {
        RepeatAnno ob = new RepeatAnno();

        try {
            Class<?> c = ob.getClass();

            // получить аннотации для метода myMeth()
            Method m = c.getMethod("myMeth", String.class, int.class);

            // вывести повторяющиеся аннотации MyAnno
            Annotation anno = m.getAnnotation(MyRepeatedAnnos.class);
            System.out.println(anno);
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден");
        }
    }

    public static void main(String[] args) {
        myMeth("тест", 10);
    }
}
/*
Как пояснялось ранее, чтобы сделать аннотацию MyAnno повторяющейся, ее нужно снабдить аннотацией @RepeataЬle,
указывающей ее контейнерную аннотацию, которая называется MyRepeatedAnnos. В данной программе для доступа
к повторяющимся аннотациям вызывается метод getAnnotation(), которому передается класс контейнерной аннотации,
а не самой повторяющейся аннотации. Как следует из результата выполнения данной программы,
повторяющиеся аннотации разделяются запятой. Они не возвращаются по отдельности.
---------------------------------------------------
@Chapter12.Package06.MyRepeatedAnnos(value=[@Chapter12.Package06.MyAnno(val=-1, str=Первая аннотация),
                                            @Chapter12.Package06.MyAnno(val=100, str=Вторая аннотация)])
 */