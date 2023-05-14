package teachmeskills.homework5;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

//        Создать трехмерный массив из целых чисел.
//        С помощью циклов "пройти" по всему массиву и увеличить каждый
//        элемент на заданное число. Пусть число, на которое будет
//        увеличиваться каждый элемент, задается из консоли.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Set number for evaluating");
        int evaluateNumber = scanner.nextInt();

        Random random = new Random();
        int arrayLength = random.nextInt(1) + 3;
        int[][][] array = new int[arrayLength][arrayLength][arrayLength];

        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                for (int k = 0; k < arrayLength; k++) {
                    array[i][j][k] = random.nextInt(100) + 1;
                    System.out.print(array[i][j][k] + " ");
                    array[i][j][k] += evaluateNumber;
                }
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("After evaluating ======================================");
        for (int[][] secondArray : array) {
            for (int[] thirdArray : secondArray) {
                for (int element : thirdArray) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

