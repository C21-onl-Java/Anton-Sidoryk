package teachmeskills.homework4;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
//        Создайте массив из n случайных целых чисел и выведите его на экран.
//        Размер массива пусть задается с консоли и размер массива может быть
//        больше 5 и меньше или равно 10.
//        Если n не удовлетворяет условию - выведите сообщение об этом.
//                Если пользователь ввёл не подходящее число, то программа должна
//        просить пользователя повторить ввод.
//        Создайте второй массив только из чётных элементов первого массива,
//                если они там есть, и вывести его на экран.


        System.out.println("Set the array length");
        int[] array;
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();

        if (arrayLength > 5 && arrayLength <= 10) {
            array = new int[arrayLength];
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) Math.round((Math.random() * 40));
            }
            System.out.println(Arrays.toString(array));

            int counter = 0;
            for (int x = 0; x<array.length; x++) {
                if (x % 2 == 0) {
                    counter++;
                }
            }

            int[] secondArray = new int[counter];
            int counter2 = 0;
            for (int x = 0; x<array.length; x++) {
                if (x % 2 == 0) {
                    secondArray[counter2] = array[x];
                    counter2++;
                }
            }
            System.out.println(Arrays.toString(secondArray));
        } if (arrayLength <= 5 || arrayLength > 10) {
            System.out.println("Please, set the length from 5 to 10");
        }

    }
}
