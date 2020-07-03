package Chapter03;

public class BubbleSort {
    public static void main (String [] args) {
        System.out.println("\nАлгоритм пузырьковой сортирвки массива целых чисел.");
        int [] nums = new int [10];
        System.out.print("\nСгенерированный массив: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(0 + Math.random() * 100);
            System.out.print(nums[i] + " ");
        }

        // Алгоритм пузырьковой сортирвки
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int tmp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = tmp;
                }
            }
        }

        System.out.print("\nОтсортированный массив: ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\n");
    }
}

/*
---------------------------
Алгоритм пузырьковой сортирвки массива целых чисел.

Сгенерированный массив: 38 42 36 60 25 81 98 86 18 89
Отсортированный массив: 18 25 36 38 42 60 81 86 89 98 
 */