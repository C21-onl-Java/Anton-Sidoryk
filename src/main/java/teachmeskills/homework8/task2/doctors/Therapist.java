package teachmeskills.homework8.task2.doctors;

public class Therapist implements Doctor {

    public Therapist() {
    }

    @Override
    public void heal() {
        System.out.println("The therapist prescribes the right treatment...");
    }
}
