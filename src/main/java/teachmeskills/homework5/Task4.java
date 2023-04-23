package teachmeskills.homework5;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Создайте двумерный массив целых чисел. Выведите на консоль сумму
//        всех элементов массива.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the length for rows");
        int arrayLengthRows = scanner.nextInt();

        System.out.println("Set the length for cells");
        int arrayLengthCells = scanner.nextInt();
        int[][] array = new int[arrayLengthRows][arrayLengthCells];

        Random random = new Random();

        int sum = 0;
        for (int x = 0; x < arrayLengthRows; x++) {
            for (int y = 0; y < arrayLengthCells; y++) {
                array[x][y] = random.nextInt(100) + 1;
                System.out.print(array[x][y] + " ");
                sum += array[x][y];
            }
            System.out.println();
        }
        System.out.println("The sum of all array values is equal to： " +sum);
    }
}
