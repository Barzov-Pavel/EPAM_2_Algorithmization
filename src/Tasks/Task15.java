// 5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

package Tasks;

import java.util.Arrays;

public class Task15 {

    public static void main(String[] args) {
        printNumbers(getRandomArray());
    }

    private static void printNumbers(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    private static int[] getRandomArray() {
        // get random size of array
        int n = (int) (Math.random() * 10 + 10);
        int[] array = new int[n];

        // fill the array with random data
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 30 - 10);
        }
        return array;
    }
}
