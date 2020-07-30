package Chapter12.Package05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {
    String str();
    int val();
}
class Meta2 {
    // У метода myMeth() теперь имеются два аргумента
    @MyAnno2(str = "Два параметра", val = 200)
    public static void myMeth(String s, int i) {
        Meta2 ob = new Meta2();

        try {
            Class<?> c = ob.getClass();

            // Здесь указываются типы параметров
            Method m = c.getMethod("myMeth", String.class, int.class);

            MyAnno2 anno = m.getAnnotation(MyAnno2.class);

            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth("Тест", 10);
    }
}
/* ------------
Два параметра 200

В этой версии метод myMeth() принимает параметры типа String и int. Чтобы получить сведения об этом методе,
следует вызвать метод getMethod() так, как показано ниже, где объекты Class, представляющие типы String и int,
передаются в виде дополнительных аргументов.

  Method m = c.getMethod("myMeth", String.class, int.class);

 */