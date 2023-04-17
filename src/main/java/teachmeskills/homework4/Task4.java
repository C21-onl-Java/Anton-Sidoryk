package teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
//        Создайте 2 массива из 5 чисел.
//                Выведите массивы на консоль в двух отдельных строках.
//                Посчитайте среднее арифметическое элементов каждого массива и
//        сообщите, для какого из массивов это значение оказалось больше (либо
//                сообщите, что их средние арифметические равны).

        int[] array = new int[5];
        int[] secondArray = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40));
            secondArray[i] = (int) Math.round((Math.random() * 30));

        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(secondArray));

        double averageFirstArray = 0;
        double averageSecondArray = 0;

        for (int x = 0; x < array.length; x++) {
            averageFirstArray += array[x];
        }

        for (int y = 0; y < secondArray.length; y++) {
            averageSecondArray += secondArray[y];
        }

        if (averageFirstArray / array.length == averageSecondArray / secondArray.length) {
            System.out.println("Average values of the two arrays are equal");
        } else {
            System.out.println("Average values of the first array equal " + averageFirstArray / array.length);
            System.out.println("Average values of the second array equal " + averageSecondArray / secondArray.length);

        }
    }
}
