package Chapter19;

import java.util.Properties;
import java.util.Set;

// Продемонстрировать применение списка свойств
class PropDemo {
    public static void main(String[] args) {
        Properties capitals = new Properties();
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
        System.out.println("\nНайти штат, отсутствующий в списке, " +
                             "указав значения, выбираемые по умолчанию...\n");

        String str = capitals.getProperty("Флорида", " не найдена");
        System.out.println("Cтoлицa штата Флорирда " + str + ".");
    }
}
/* -----------------------------------------------------------------------------
Cтoлицa штата Калифорния - Сакраменто.
Cтoлицa штата Иллинойс - Спрингфилд.
Cтoлицa штата Mиccypи - Джефферсон-Сити.
Cтoлицa штата Вашингтон - Олимпия.
Cтoлицa штата Индиaнa - Индианаполис.

Найти штат, отсутствующий в списке, указав значения, выбираемые по умолчанию...

Cтoлицa штата Флорирда  не найдена.
 */