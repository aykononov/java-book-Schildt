package Chapter19;

// Преобразовать списочный массив типа ArrayList в обычный массив
import java.util.ArrayList;

public class ArrayListToArray {
    public static void main(String[] args) {
        // Создание коллекции целых чисел
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        System.out.println("Содержимое коллекции: " + al);
        // Получить обычный массив
        Integer[] nums = new Integer[al.size()];
        // Вызывается метод toArray() и получается массив элементов типа Integer
        nums = al.toArray(nums);
        System.out.println("Размер массива nums: " + nums.length);
        int sum = 0;
        // Суммируем содержимое массива
        for (Integer i: nums) {
            sum += i;
        }
        System.out.println("Сумма содержимого nums: " + sum);
    }
}
/* -----------------------
Содержимое коллекции: [1, 2, 3]
Размер массива nums: 3
Сумма содержимого nums: 6
 */