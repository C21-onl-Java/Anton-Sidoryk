package teachmeskills.homework8.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this(number, model, 0);
    }

    public Phone() {
        this("", "");
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Calling " + name + ", phone number: " + number);
    }

    public void sendMessage(String... numbers) {
        System.out.print("Send message to number: ");
        for (String number : numbers) {
            System.out.print(number + "; ");
        }
        System.out.println();
    }

    public String toString() {
        return "Model is " + getModel() + ". Phone number is " + getNumber() + ". The weight is " + getWeight();
    }
}
