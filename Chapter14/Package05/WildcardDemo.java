package Chapter14.Package05;

// Продемонстрировать применение метасимволов подстановки в качестве аргументов
class Stats<T extends Number> {
    T[] nums; // массив класса NumЬer или его подкласса

    // передать конструктору ссылку на массив
    // элементов класса Number или его подкласса
    Stats(T[] o) {
        nums = o;
    }

    // возвратить значение типа double в любом случае
    double average() {
        double sum = 0.0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i].byteValue();
        }
        return sum / nums.length;
    }

    // Определить равенство двух средних значений
    // с применением метасимвола подстановки
    boolean sameAvg(Stats<?> ob) {
        if (average() == ob.average()) {
            return true;
        }
        return false;
    }
}

class WildcardDemo {
    public static void main(String[] args) {
        Integer[] inums = {1, 2, 3, 4, 5};
        Stats<Integer> iob = new Stats<Integer>(inums);
        double avgi = iob.average();
        System.out.println("Cpeднee значение iob равно: " + avgi);

        Double[] dnums = {1.1, 2.2, 3.3, 4.4, 5.5};
        Stats<Double> dob = new Stats<Double>(dnums);
        double avgd = dob.average();
        System.out.println("Cpeднee значение dob равно: " + avgd);

        Float[] fnums = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats<Float> fob = new Stats<Float>(fnums);
        double avgf = fob.average();
        System.out.println("Cpeднee значение fob равно: " + avgf);

        // Проверить, какие массивы имеют одинаковые средние значения
        System.out.print("Cpeдниe значения iob и dob: ");
        if (iob.sameAvg(dob)) {
            System.out.println("равны");
        } else {
            System.out.println("НЕ равны");
        }

        System.out.print("Cpeдниe значения iob и fob: ");
        if (iob.sameAvg(fob)) {
            System.out.println("одинаковы");
        } else {
            System.out.println("отличаются");
        }
    }
}

/* ----------------------------------
Cpeднee значение iob равно: 3.0
Cpeднee значение dob равно: 3.0
Cpeднee значение fob равно: 3.0
Cpeдниe значения iob и dob: равны
Cpeдниe значения iob и fob: одинаковы
 */