class Vehicle {
    String type;
    int wheels;
    String fuel;

    Vehicle() {
        this.type = "Unknown";
        this.wheels = 0;
        this.fuel = "Unknown";
    }

    Vehicle(String type, int wheels) {
        this.type = type;
        this.wheels = wheels;
        this.fuel = "Unknown";
    }

    Vehicle(String type, int wheels, String fuel) {
        this.type = type;
        this.wheels = wheels;
        this.fuel = fuel;
    }

    void displayInfo() {
        System.out.println("Type: " + type + ", Wheels: " + wheels + ", Fuel: " + fuel);
    }

    void start() {
        System.out.println("The vehicle is starting.");
    }

    void start(String mode) {
        System.out.println("The vehicle is starting in " + mode + " mode.");
    }

    void start(String mode, int speed) {
        System.out.println("The vehicle is starting in " + mode + " mode at " + speed + " km/h.");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.displayInfo();
        vehicle1.start();
        
        Vehicle vehicle2 = new Vehicle("Car", 4);
        vehicle2.displayInfo();
        vehicle2.start("Normal");

        Vehicle vehicle3 = new Vehicle("Motorcycle", 2, "Petrol");
        vehicle3.displayInfo();
        vehicle3.start("Sport", 100);
    }
}
