package Chapter14.Package04;

// В этой версии класса Stats аргумент типа Т должен
// быть классом Number или наследуемым от него классом

class Stats<T extends Number> {
    T[] nums; //массив класса NumЬer или его подкласса

    // передать конструктору ссылку на массив элементов класса NumЬer или его подкласса
    Stats(T[] o) {
        nums = o;
    }

    // Тип Т ограничивается сверху классом Number, соответственно,
    // компилятору Java теперь известно, что все объекты типа T могут
    // вызывать метод doubleValue(), поскольку это метод из класса Number.


    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i].doubleValue();
        return sum / nums.length;
    }
}

// Продемонстрировать ограничение параметра типа
class StatsDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("Cpeднee значение iOb равно: " + v);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dOb = new Stats<Double>(dnums);
        double w = dOb.average();
        System.out.println("Cpeднee значение dOb равно: " + w);

        // Этот код не скомпилируется, так как класс String
        // не является производным от класса Number
        // String strs[] = { "1", "2", "3", "4", "5" };
        // Stats<String> strob = new Stats<String>(strs);
        // douЫe х = strob.average();
        // System.out.println("Cpeднee значение strob равно " + v);
    }
}
/* ----------------------------
Cpeднee значение iOb равно: 3.0
Cpeднee значение dOb равно: 3.3
 */