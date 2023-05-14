package teachmeskills.homework8.task1;

public class TestScenarioForPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone("34523543", "IPhone 11", 1.1);
        Phone phone2 = new Phone("54353458", "Xiaomi", 1.3);
        Phone phone3 = new Phone("43453445", "Nokia", 1.2);

        System.out.println(phone3.toString());
        phone1.receiveCall("Jimmy");
        phone1.receiveCall("Jimmy", "45539485");
        phone2.sendMessage("4346456346", "453495834", "90000211");
        System.out.println(phone2.getModel());

    }
}
