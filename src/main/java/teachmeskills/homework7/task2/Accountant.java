package teachmeskills.homework7.task2;

public class Accountant implements Employees {
    private String position = "Accountant";

    public Accountant() {

    }

    @Override
    public void getPosition() {
        System.out.println("The position is: " + this.position);
    }
}
