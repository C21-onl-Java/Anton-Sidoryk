package teachmeskills.homework8.task2.doctors;

public class Dentist implements Doctor {

    public Dentist() {
    }

    @Override
    public void heal() {
        System.out.println("The dentist take care of teeth.");
    }
}
