package Chapter20;

import java.util.StringTokenizer;

// Продемонстрировать применение класса StringTokenizer
public class STDemo {
    static String in = "Название=Jаvа. Полное руководство;"
            + "Автор=Шилдт;"
            + "Издательство=Оrасlе Press;"
            + "Авторское право=2018";

    public static void main(String args[]) {
        StringTokenizer st = new StringTokenizer(in, "=;");
        while (st.hasMoreTokens()) {
            String key = st.nextToken();
            String val = st.nextToken();
            System.out.println(key + "\t" + val);
        }
    }
}

/*
Название	Jаvа. Полное руководство
Автор	Шилдт
Издательство	Оrасlе Press
Авторское право	2018
 */