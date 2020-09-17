package Chapter18.Package02;

// Продемонстрировать применение методов totalMemory(), freeMemory() и gc()

class MemoryDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        long mem1, mem2;
        Integer[] someints = new Integer[1000];

        System.out.println("Всего памяти: " + r.totalMemory());
        mem1 = r.freeMemory();
        System.out.println("Свободно: " + mem1);
        System.out.println("Вызов сборки мусора...");
        r.gc();
        mem1 = r.freeMemory();
        System.out.println("Свободно после очистки: " + mem1);
        for (int i = 0; i < 1000; i++) {
            // выделить память для объектов типа Integer
            someints[i] = new Integer(i);
        }
        mem2 = r.freeMemory();
        System.out.println("Свободно после выделения: " + mem2);
        System.out.println("Использовано для выделения: " + (mem1 - mem2));

        // отвергнуть объекты типа Integer
        for (int i = 0; i < 1000; i++) {
            someints[i] = null;
        }
        System.out.println("Вызов сборки мусора...");
        r.gc();
        mem2 = r.freeMemory();
        System.out.println("Свободно после очистки отвергнутых объектов типа  Integer: " + mem2);
    }
}
/*
Всего памяти: 130023424
Свободно: 127630568
Вызов сборки мусора...
Свободно после очистки: 7502928
Свободно после выделения: 7460968
Использовано для выделения: 41960
Вызов сборки мусора...
Свободно после очистки отвергнутых объектов типа  Integer: 7505272
 */