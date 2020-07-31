package Chapter12.Package05;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

// Маркерная аннотация
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker{}

class Marker {
    // аннотировать метод с помощью маркера
    // Обратите внимание на обязательность скобок ()
    @MyMarker
    public static void myMeth() {
        Marker ob = new Marker();
        try {
            Method m = ob.getClass().getMethod("myMeth");

            // определить наличие аннотации
            if (m.isAnnotationPresent(MyMarker.class))
                System.out.println("Маркерная аннотация MyMarker присутствует.");
        } catch (NoSuchMethodException e) {
            System.out.println("Meтoд не найден.");
        }
    }

    public static void main(String[] args) {
        myMeth();
    }
}

/* Применяя маркерную аннотацию @MyMarker, совсем не обязательно указывать скобки после ее имени.
Это означает, что маркерная аннотация @MyMarker применяется просто по ее имени. И хотя указание скобок
после имени маркерной аннотации не считается ошибкой, делать это совсем не обязательно.
--------------------------------------
Маркерная аннотация MyMarker присутствует.
 */