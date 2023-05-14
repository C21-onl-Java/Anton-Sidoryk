package teachmeskills.homework6.task2;

public class TestScenarioForComputer {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1600, "Lenovo Legion");
        System.out.println("Default information without RAM and HDD");
        computer1.printInfo();
        System.out.println("================================================================");

        System.out.println("Information with RAM and HDD");
        RAM ram2 = new RAM("Kingston FURY Beast", 32);
        HDD hdd2 = new HDD("Seagate", 1200, "SSD");
        Computer computer2 = new Computer(2500, "MacBook Pro 2022", ram2, hdd2);
        computer2.printInfo();
    }
}
