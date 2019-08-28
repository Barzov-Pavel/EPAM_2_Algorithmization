// 9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
// чисел несколько, то определить наименьшее из них.

package Tasks;

import java.util.Arrays;

public class Task19 {
    public static void main(String[] args) {
        System.out.println(getMinOfMaxFrequency(getRandomArray()));
    }

    public static int getMinOfMaxFrequency(int... arr) {
        int res = 0;
        int[] counts = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int count = 1;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }

            counts[i] = count;
            if (counts[i] == counts[res])
                res = arr[res] > arr[i] ? i : res;
            else
                res = count > counts[res] ? i : res;
        }
        return arr[res];
    }

    private static int[] getRandomArray() {
        // get random size of array
        int n = (int) (Math.random() * 10 + 10);
        int[] array = new int[n];

        // fill the array with random data
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array));
        return array;
    }
}
