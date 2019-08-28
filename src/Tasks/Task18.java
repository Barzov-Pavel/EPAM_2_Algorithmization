// 8. Дана последовательность целых чисел a1 a2 an
// Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min( a1, a2, an)

package Tasks;

import java.util.Arrays;

public class Task18 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteMinValue(getRandomArray())));
    }

    public static int[] deleteMinValue(int[] array) {

        if (array.length == 0) {
            throw new IllegalArgumentException("Массив нулевой длины!");
        }

        int minCount = 0;
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] <= min) {
                min = array[i];
            }
        }

        for (int value : array) {
            if (value == min) {
                minCount++;
            }
        }

        int[] result = new int[array.length - minCount];

        int indexResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                result[indexResult] = array[i];
                indexResult++;
            }
        }
        return result;
    }

    private static int[] getRandomArray() {
        // get random size of array
        int n = (int) (Math.random() * 10 + 10);
        int[] array = new int[n];

        // fill the array with random data
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 290 + 10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
