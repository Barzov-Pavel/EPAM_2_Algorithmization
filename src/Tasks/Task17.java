// 7. Даны действительные числа а1, а2, ..., аn. Найти  max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).

package Tasks;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        System.out.println(max(getRandomArrayWithRealNumbers()));
    }

    public static double max(double[] arr) {
        double max = Double.MIN_VALUE;
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            max = Double.max(max, arr[i] + arr[j]);
        }
        return max;
    }

    private static double[] getRandomArrayWithRealNumbers() {
        // get random size of array
        int n = (int) (Math.random() * 10 + 10);
        double[] array = new double[n];

        // fill the array with random data
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 50 - 25;
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

}
