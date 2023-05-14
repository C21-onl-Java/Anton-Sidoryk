package teachmeskills.homework8.task2.doctors;

public class Surgeon implements Doctor {

    public Surgeon() {
    }

    @Override
    public void heal() {
        System.out.println("The surgeon performs the operation...");
    }
}
