package teachmeskills.homework6.task1;

import java.util.Random;
import java.util.Scanner;

public class CashoutFromCreditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the amount for Card 1");
        CreditCard card1 = new CreditCard(9098, scanner.nextDouble());

        System.out.println("Set the amount for Card 2");
        CreditCard card2 = new CreditCard(7686433, scanner.nextDouble());

        System.out.println("Set the amount for Card 3");
        CreditCard card3 = new CreditCard(32764836, scanner.nextDouble());

        getInfo(card1);
        getInfo(card2);
        getInfo(card3);

        card1.charge(3400);
        card2.charge(1330);

        card3.withdraw(300);

        System.out.println("Information about Card 1: ");
        card1.getInfo();
        System.out.println();

        System.out.println("Information about Card 2: ");
        card2.getInfo();
        System.out.println();

        System.out.println("Information about Card 3: ");
        card3.getInfo();
        System.out.println();
    }
    public static void getInfo(CreditCard card) {
        System.out.println("Information about Card #: " + card.getAccountNumber());
        card.getInfo();
        System.out.println();
    }
}

