// 2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
// числом. Подсчитать количество замен.

package Tasks;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
        replaceNumbers(getRandomArrayWithRealNumbers(), 15);
    }

    private static void replaceNumbers(double[] array, int z) {
        System.out.println(Arrays.toString(array));
        int quantityOfReplacements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > z) {
                array[i] = z;
                quantityOfReplacements++;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("Количество замен равно: " + quantityOfReplacements);
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
