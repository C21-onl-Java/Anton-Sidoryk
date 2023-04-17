package teachmeskills.homework4;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        int[] array = {88, 123, 67, 4, 9, 11};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}

