package teachmeskills.homework2;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        System.out.println("Write your first name");
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();

        System.out.println("Write your age");
        int years = scanner.nextInt();

        if (years > 0 && years < 18) {
            System.out.println(firstName + " is a minor");
        } else if (years >= 18 && years <= 44) {
            System.out.println(firstName + " is young");
        } else if (years > 45 && years <= 59) {
            System.out.println(firstName + " is middle-aged");
        } else if (years < 0) {
            System.out.println("Wrong age");
        } else {
            System.out.println(firstName + " is elderly");
        }
    }
}
