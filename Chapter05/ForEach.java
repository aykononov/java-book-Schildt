package Chapter05;
//Пример цикла for в стиле for each
public class ForEach {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        System.out.println("\nТрадиционный цикл:");
        for (int i = 0; i < 10; i++){
            System.out.print(" " + arr[i]);
        }

        System.out.println("\n\nЦикл в стиле for each:");
        for (int i : arr) {
            System.out.print(" " + i);
        }
    }
}