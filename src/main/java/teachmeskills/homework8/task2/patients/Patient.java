package teachmeskills.homework8.task2.patients;

import teachmeskills.homework8.task2.TreatmentPlan;
import teachmeskills.homework8.task2.doctors.Dentist;
import teachmeskills.homework8.task2.doctors.Doctor;
import teachmeskills.homework8.task2.doctors.Surgeon;
import teachmeskills.homework8.task2.doctors.Therapist;

public class Patient {

    private String name;
    private int age;
    private int treatmentPlan;

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getTreatmentPlan() {
        return this.treatmentPlan;
    }

    public void setTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan.getTreatmentPlan();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void assignDoctor(Doctor doctor) {
        System.out.println("For patient " + getName() + " " + getAge() + " years old treatment was prescribed");
        doctor.heal();
    }

    public void assignDoctor() {
        if (getTreatmentPlan() == 1) {
            assignDoctor(new Surgeon());
        } else if (getTreatmentPlan() == 2) {
            assignDoctor(new Dentist());
        } else assignDoctor(new Therapist());
    }

    public void assignTreatmentPlan(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan.getTreatmentPlan();
    }

    public void assignTreatmentPlan(int treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

}
