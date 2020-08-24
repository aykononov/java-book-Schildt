package Chapter14.Package05;

// Продемонстрировать Ограниченные метасимвольные аргументы

// Двумерные координаты
class TwoDimension {
    int x, y;
    TwoDimension(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Трехмерные координаты
class ThreeDimension extends TwoDimension {
    int z;
    ThreeDimension(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

// Четырехмерные координаты
class FourDimension extends ThreeDimension {
    int t;
    FourDimension(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
    }
}

// Этот класс хранит массив координатных объектов
class Coords <T extends TwoDimension> {
    T[] coords;
    Coords(T[] o) {
        coords = o;
    }
}


class BoundedWildcard {
    static void showXY(Coords<?> c) {
        System.out.println("Koopдинaты Х У:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeDimension> c) {
        System.out.println("Koopдинaты Х У Z:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourDimension> c) {
        System.out.println("Koopдинaты Х У Z T:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z + " " +
                               c.coords[i].t);

        }
    }

    public static void main(String[] args) {

        // Создать
        TwoDimension[] tdOb = {new TwoDimension(0,0),
                               new TwoDimension(1,2),
                               new TwoDimension(6,7),
                               new TwoDimension(-1, -9)};

        Coords<TwoDimension> tdlocs = new Coords<TwoDimension>(tdOb);

        System.out.println("Coдepжимoe объекта tdlocs.");
        showXY(tdlocs);
        // showXYZ(tdlocs); // ОШИБКА!!!, это не  тип ThreeDimension
        // showAll(tdlocs); // ОШИБКА!!!, это не  тип FourDimension

        FourDimension[] fdOb = {new FourDimension(1, 2, 3, 4),
                                new FourDimension(4, 5, 6, 7),
                                new FourDimension(7, 8, 9, 0),
                                new FourDimension(3, -2, -4, 1)};

        Coords<FourDimension> fdlocs = new Coords<FourDimension>(fdOb);

        System.out.println("Coдepжимoe объекта fdlocs.");

        // Здесь все верно
        showXY(fdlocs);
        showXYZ(fdlocs);
        showAll(fdlocs);
    }
}
