package teachmeskills.homework3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class AdditionalTask1 {
    public static void main(String[] args) {
        int[] array = new int[11];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i < 11; ++i) {
            array[i] = array[i - 1] + array[i - 2];
        }
        System.out.println(Arrays.toString(array));
    }
}
