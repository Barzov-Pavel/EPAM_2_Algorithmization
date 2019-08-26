package Tasks;// 1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Arrays;

public class Task11 {

    public static void main(String[] args) {
        sumElements(getRandomArray(), 6);

    }

    private static void sumElements(int[] array, int k) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                sum += array[i];
            }
        }
        System.out.println("Сумма элементов кратных К равна: " + sum);
    }

    private static int[] getRandomArray() {
        // get random size of array
        int n = (int) (Math.random() * 10 + 10);
        int[] array = new int[n];

        // fill the array with random data
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 290 + 10);
        }
        return array;
    }
}
