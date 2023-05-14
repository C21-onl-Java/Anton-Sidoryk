package teachmeskills.homework7.task2;

public class Director implements Employees {
    private String position = "Director";

    public Director() {

    }

    @Override
    public void getPosition() {
        System.out.println("The position is: " + this.position);
    }
}
