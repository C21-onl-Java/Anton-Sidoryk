package teachmeskills.homework6.task3;

import java.util.Currency;

public class ATM {

    private int twenty;
    private int fifty;
    private int oneHundred;

    public ATM(int twenty, int fifty, int oneHundred) {
        this.twenty = twenty;
        this.fifty = fifty;
        this.oneHundred = oneHundred;
    }

    public void addMoney(int twenty, int fifty, int oneHundred) {
        this.twenty += twenty;
        this.fifty += fifty;
        this.oneHundred += oneHundred;
    }

    public boolean cashOut(int amount) {

        int oneHundred = amount / 100; //43
        int fifty = (amount % 100) / 50; // 1
        int twenty = ((amount % 100) % 50) / 20;

        //Check if we have enough banknotes for operation
        if (oneHundred > this.oneHundred || fifty > this.fifty || twenty > this.twenty) {
            System.out.println("Not enough banknotes");
            return false;
        }

        this.oneHundred -= oneHundred;
        this.fifty -= fifty;
        this.twenty -= twenty;

        System.out.println("After Cash Out " + amount + " available balance for Cash out " + availableBalance());
        System.out.println("Were issued " + oneHundred + " banknotes for 100$. " + fifty + " banknotes for 50$. " + twenty + " banknotes for 20$");
        return true;
    }

    public double availableBalance() {
        return (this.oneHundred * 100) + (this.fifty * 50) + (this.twenty * 20);
    }
}
