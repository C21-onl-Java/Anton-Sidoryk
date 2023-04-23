package teachmeskills.homework5;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
//        Создайте двумерный массив целых чисел. Отсортируйте элементы в
//        строках двумерного массива по возрастанию.

        int[][] array = {{1, 66, 7}, {23, 11, 56}, {87, 8, 10}};

        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

