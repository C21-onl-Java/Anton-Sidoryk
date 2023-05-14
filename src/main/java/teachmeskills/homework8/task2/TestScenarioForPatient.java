package teachmeskills.homework8.task2;

import teachmeskills.homework8.task2.patients.Patient;

import java.util.Scanner;

public class TestScenarioForPatient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreatmentPlan treatmentPlan = new TreatmentPlan();

        System.out.println("Write your name");
        String name = scanner.nextLine();

        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("Set the Treatment Plan");
        treatmentPlan.setTreatmentPlan(scanner.nextInt());

        Patient patient = new Patient(name, age);
        patient.assignTreatmentPlan(treatmentPlan.getTreatmentPlan());
        patient.assignDoctor();
    }
}
