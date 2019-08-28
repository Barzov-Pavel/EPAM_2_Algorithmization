// 10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
// элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

package Tasks;

import java.util.Arrays;

public class Task110 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getLessArray(getRandomArray())));
    }

    private static int[] getLessArray(int[] data) {
        if (data.length < 2)
            return data;
        int numberCut = data.length / 2;

        int count = 1;
        if (data.length > 2) {


            for (int i = 2; i < data.length; i += 2) {
                data[count] = data[i];
                count++;
            }
            if (data.length % 2 == 0) {
                data = Arrays.copyOf(data, data.length / 2);
            } else {
                data = Arrays.copyOf(data, data.length / 2 + 1);
            }
        } else {
            data = Arrays.copyOf(data, data.length / 2);
        }
        return data;
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
