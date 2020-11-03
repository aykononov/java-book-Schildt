package Chapter19;

import java.util.Properties;
import java.util.Set;

// Использовать список свойств по умолчанию
class PropDefDemo {
    public static void main(String[] args) {

        // Список по умолчяанию
        Properties defList = new Properties();
        defList.put("Флорида", "Тэлесси");
        defList.put("Bиcкoнcин", "Мэдисон");

        Properties capitals = new Properties(defList);

        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Mиccypи", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиaнa", "Индианаполис");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // показать все штаты и их столицы
        for (Object name : states) {
            System.out.println("Cтoлицa штата " + name + " - "
                    + capitals.getProperty((String)name) + ".");
        }

        System.out.println("\nТеперь штат Флорида будет найден" +
                            " в списке по умолчанию...\n");
        String str = capitals.getProperty("Флорида");
        System.out.println("Cтoлицa Флориды - " + str + ".");
    }
}

/* ------------------------------------------------------
Cтoлицa штата Калифорния - Сакраменто.
Cтoлицa штата Иллинойс - Спрингфилд.
Cтoлицa штата Mиccypи - Джефферсон-Сити.
Cтoлицa штата Вашингтон - Олимпия.
Cтoлицa штата Индиaнa - Индианаполис.

Теперь штат Флорида будет найден в списке по умолчанию...

Cтoлицa Флориды - Тэлесси.

 */