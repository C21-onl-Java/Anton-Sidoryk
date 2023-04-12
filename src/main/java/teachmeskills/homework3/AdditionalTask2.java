package teachmeskills.homework3;

import java.util.Scanner;

public class AdditionalTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the deposit amount");
        float depositAmount = scanner.nextInt();
        System.out.println("Enter the number of months for the deposit");
        int month = scanner.nextInt();
        for (int i = 1; i <= month; i++) {
            depositAmount += depositAmount * 0.07;
        }
        System.out.println("For " + month + " months, your income will be " + depositAmount);
    }
}
