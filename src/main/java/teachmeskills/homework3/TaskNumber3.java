package teachmeskills.homework3;

import java.util.Scanner;

public class TaskNumber3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the number");
        int number = scanner.nextInt();
        checkThatNumberIsEven(number);
    }

    public static void checkThatNumberIsEven(int number) {
        if (number % 2 == 0) System.out.println("The number " + number + " is even");
        else System.out.println("The number " + number + " is odd");
    }
}
