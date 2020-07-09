package Chapter05;
// Простой пример применения оператора switch
public class SampleSwitch {
    public static void main(String[] args) {
        System.out.println("Пример применения оператора switch\n");
        for (int i = 0; i < 8; i++) {
            switch (i) {
                case 1:
                    System.out.println(i + " один");
                    break;
                case 2:
                    System.out.println(i + " два");
                    break;
                case 3:
                    System.out.println(i + " три");
                    break;
                case 4:
                case 5:
                case 6:
                    System.out.println(i + " меньше 8");
                    break;
                default:
                    System.out.println("default " + i);
            }
        }
    }
}

/*
-----------------
default 0
1 один
2 два
3 три
4 меньше 8
5 меньше 8
6 меньше 8
default 7
 */