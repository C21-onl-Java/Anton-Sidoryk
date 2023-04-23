package teachmeskills.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    private static final int ARRAY_SIZE = 4;

    public static void main(String[] args) {

//        Создайте двумерный массив. Выведите на консоль диагонали массива.

        int[][] array = new int[ARRAY_SIZE][ARRAY_SIZE];

        Random random = new Random();

        for (int x = 0; x < ARRAY_SIZE; x++) {
            for (int y = 0; y < ARRAY_SIZE; y++) {
                array[x][y] = random.nextInt(100) + 1;
                System.out.print(array[x][y] + " ");
            }
            System.out.println();
        }

        System.out.println("Main diagonal =============================");
        for (int x = 0; x < ARRAY_SIZE && x < array[0].length; x++) {
            System.out.print(array[x][x] + " ");
        }
        System.out.println();

        System.out.println("Second diagonal =============================");
        for (int x = 0; x < ARRAY_SIZE && x < array[0].length; x++) {
            System.out.print(array[x][array[0].length - x - 1] + " ");
        }
        System.out.println();
    }
}
