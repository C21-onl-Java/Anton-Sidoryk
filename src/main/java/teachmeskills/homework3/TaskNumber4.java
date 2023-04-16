package teachmeskills.homework3;

import java.util.Scanner;

public class TaskNumber4 {
    public static void main(String[] args) {
        System.out.println("Write the temperature");
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        checkTheTemperature(temperature);
    }

    public static void checkTheTemperature(int temperature) {
        if (temperature > -5) System.out.println("Warm weather");
        else if (temperature > -20 && temperature <= -5) System.out.println("Normal weather");
        else if (temperature <= -20) System.out.println("Weather is cold");
    }
}
