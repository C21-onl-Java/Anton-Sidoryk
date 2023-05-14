package teachmeskills.homework6.task2;

public class HDD {
    private String name;
    private int volume;
    private String type;


    public HDD() {
        this.name = "Default HDD";
        this.volume = 500;
        this.type = "Internal";
    }

    public HDD(String name, int volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Volume: " + volume + " GB");
        System.out.println("Type: " + type);
    }
}
