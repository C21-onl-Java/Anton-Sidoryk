package teachmeskills.homework6.task2;

public class RAM {
    private String name;
    private int volume;

    public RAM() {
        this.name = "Default RAM";
        this.volume = 4;
    }

    public RAM(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Volume: " + volume + " GB");
    }
}
