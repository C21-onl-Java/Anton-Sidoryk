package teachmeskills.homework4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Set the array length");
        int[] array;
        Scanner scanner = new Scanner(System.in);
        int arrayLegth = scanner.nextInt();

        System.out.println("Set the number");
        int number = scanner.nextInt();

        array = new int[arrayLegth];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40));
        }

        boolean isContains = false;

        for (int i = 0; i < array.length; i++) {
            if (number == array[i]) {
                System.out.println("Number " + number + " included in the array and located under the index " + i);
                isContains = true;
                break;
            }
        }
        if (!isContains) {
            System.out.println("Number " + number + " doesn't include in the array");
        }
    }
}
