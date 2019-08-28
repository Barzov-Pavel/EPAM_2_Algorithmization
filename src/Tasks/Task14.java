// 4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

package Tasks;

import java.util.Arrays;

public class Task14 {

    public static void main(String[] args) {
        changeMinMax(getRandomArrayWithRealNumbers());
    }

    private static void changeMinMax(double[] array) {
        System.out.println(Arrays.toString(array));

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        int indexOfMin = 0;
        int indexOfMax = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
                indexOfMax = i;
            }
            if (array[i] < min) {
                min = array[i];
                indexOfMin = i;
            }
        }

        array[indexOfMin] = max;
        array[indexOfMax] = min;
        System.out.println(Arrays.toString(array));
    }

    private static double[] getRandomArrayWithRealNumbers() {
        // get random size of array
        int n = (int) (Math.random() * 10 + 10);
        double[] array = new double[n];

        // fill the array with random data
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random() * 50 - 25;
        }
        return array;
    }
}
