package teachmeskills.homework6.task3;

public class TestScenarioForATM {
    public static void main(String[] args) {
        ATM atm = new ATM(200, 90, 80);
        System.out.println("Available balance: " + atm.availableBalance());

        atm.cashOut(5432);

    }
}
