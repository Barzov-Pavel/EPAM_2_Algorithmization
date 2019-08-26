// 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
// положительных и нулевых элементов.

package Tasks;

import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        checkQuantity(getRandomArrayWithRealNumbers());
    }

    private static void checkQuantity(double[] array) {
        int quantityOfPositiveNumbers = 0;
        int quantityOfNegativeNumbers = 0;
        int quantityOfZeros = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                quantityOfPositiveNumbers++;
            } else if (array[i] == 0) {
                quantityOfZeros++;
            } else {
                quantityOfNegativeNumbers++;
            }
        }
        System.out.println("Количество положительных чисел равно: " + quantityOfPositiveNumbers +
                "\nКоличество отрицательных чисел равно: " + quantityOfNegativeNumbers +
                "\nКоличество нулевых элементов равно: " + quantityOfZeros);
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
