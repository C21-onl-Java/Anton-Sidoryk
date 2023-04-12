package teachmeskills.homework3;

import java.util.Scanner;

public class TaskLoop3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input any number");
        int number = scanner.nextInt();
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
        }
        System.out.println("The sum of all digits from 1 to " + number + " equal: " + result);
    }
}

