package teachmeskills.homework7.task2;

public class Worker implements Employees {
    private String position = "Worker";

    public Worker() {

    }

    @Override
    public void getPosition() {
        System.out.println("The position is: " + this.position);
    }
}
