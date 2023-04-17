package teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        System.out.println("Set the array length");
        int[] array;
        Scanner scanner = new Scanner(System.in);
        int arrayLegth = scanner.nextInt();

        array = new int[arrayLegth];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40));
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        int max = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }

        System.out.println("Minimun is " + min);
        System.out.println("Maximum is " + max);
        System.out.println("The avarage is " + sum / array.length);

    }
}
