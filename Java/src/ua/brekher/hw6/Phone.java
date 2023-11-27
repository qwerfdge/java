package ua.brekher.hw6;

public class Phone {

    private String number;
    private String model;
    private double weight;


    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {}

    public void receiveCall(String callerName) {
        System.out.println(callerName + "is calling");
    }

    public String getNumber() {
        return number;
    }

    public void displayInfo() {
        System.out.println("Phone number: " + number);
        System.out.println("Phone model: " + model);
        System.out.println("Phone weight: " + weight + " г");
    }

    public static void main(String[] args) {
        Phone phone1 = new Phone("123456789", "Samsung Galaxy", 150.5);
        Phone phone2 = new Phone("987654321", "iPhone 12");
        Phone phone3 = new Phone();

        phone3.number = "111222333";
        phone3.model = "Nokia 3310";
        phone3.weight = 200.0;

        phone1.displayInfo();
        System.out.println();
        phone2.displayInfo();
        System.out.println();
        phone3.displayInfo();

        phone1.receiveCall("John");
        System.out.println("Phone number: " + phone1.getNumber());
        System.out.println();

        phone2.receiveCall("Alice");
        System.out.println("Phone number: " + phone2.getNumber());
        System.out.println();

        phone3.receiveCall("Bob");
        System.out.println("Phone number: " + phone3.getNumber());
    }
}
