package teachmeskills.homework6.task1;

public class CreditCard {
    private int accountNumber;
    private double currentAmount;

    public CreditCard(int accountNumber, double currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

    public void charge(double amount) {
        currentAmount += amount;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void withdraw(double amount) {
        if (amount <= currentAmount) {
            currentAmount -= amount;
        } else {
            System.out.println("You don't have that much money. Available balance: " + currentAmount);
        }
    }

    public void getInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Amount: " + currentAmount);
    }
}

