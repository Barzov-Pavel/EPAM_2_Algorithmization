// 6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
// являются простыми числами.

package Tasks;

import java.util.Arrays;

public class Task16 {

    public static void main(String[] args) {
        sumOfRealNumbers(getRandomArrayWithRealNumbers());
    }

    private static void sumOfRealNumbers(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (checkSimple(i)) {
                sum += array[i];
            }
        }

        System.out.println("Сумма чисел, порядковые номера которых являются простыми числами равна: " + sum);
    }

    public static boolean checkSimple(int i) {
        if (i <= 1)
            return false;
        else if (i <= 3)
            return true;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;
        int n = 5;
        while (n * n <= i) {
            if (i % n == 0 || i % (n + 2) == 0)
                return false;
            n = n + 6;
        }
        return true;
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
