package teachmeskills.homework4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
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
        System.out.println("Choose the number for deleting from array");
        int number = scanner.nextInt();

        //Create empty array for creating in the future without chosen number
        int[] arrayWithoutNumber;
        int newArraySize = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArraySize++;
            }
        }
        if (newArraySize == 0) {
            System.out.println(number + " not included in the array");
        }

        int count = 0;
        if (newArraySize > 0) {
            arrayWithoutNumber = new int[newArraySize];

            for (int x = 0; x < array.length; x++) {
                if (array[x] != number) {
                    arrayWithoutNumber[count] = array[x];
                    count++;
                }
            }
            System.out.println(Arrays.toString(arrayWithoutNumber));
        }

    }
}
