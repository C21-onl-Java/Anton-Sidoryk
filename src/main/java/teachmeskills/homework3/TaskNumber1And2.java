package teachmeskills.homework3;

import java.util.Scanner;

public class TaskNumber1And2 {
    public static void main(String[] args) {

        System.out.println("Write month number");
        Scanner scanner = new Scanner(System.in);
        // First and Second Task
        int monthNumber = scanner.nextInt();

        // System.out.println("Choose what use: 1- Switch, 2-If Else");
        int choice = scanner.nextInt();
        checkSeasonByMonthNumber(choice, monthNumber);
    }

    public static void checkSeasonByMonthNumber(int choice, int monthNumber) {
        switch (choice) {
            case 1:
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Month by number " + monthNumber + " is Winter");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Month by number " + monthNumber + " is Spring");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Month by number " + monthNumber + " is Summer");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Month by number " + monthNumber + " is Autumn");
                        break;
                    default:
                        System.out.println("Month number is incorrect, please, write the number from 1 to 12");
                }
            case 2:
                if (monthNumber >= 1 && monthNumber < 3 || monthNumber == 12)
                    System.out.println("Month by number " + monthNumber + " is Winter");
                else if (monthNumber >= 3 && monthNumber < 6)
                    System.out.println("Month by number " + monthNumber + " is Spring");
                else if (monthNumber >= 6 && monthNumber < 9)
                    System.out.println("Month by number " + monthNumber + " is Summer");
                else if (monthNumber >= 9 && monthNumber < 12)
                    System.out.println("Month by number " + monthNumber + " is Autumn");
                else System.out.println("Month number is incorrect, please, write the number from 1 to 12");
        }
    }
}
