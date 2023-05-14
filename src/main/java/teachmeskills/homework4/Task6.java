package teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
//        Создайте массив и заполните массив.
//                Выведите массив на экран в строку.
//                Замените каждый элемент с нечётным индексом на ноль.
//                Снова выведете массив на экран на отдельной строке.

        System.out.println("Set the array length");
        int[] array;
        Scanner scanner = new Scanner(System.in);
        int arrayLegth = scanner.nextInt();

        array = new int[arrayLegth];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 40));
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
