class SingleObject {

    public static void main(String[] args) {
        // Creating an instance of the Car class
        Car myCar = new Car("Toyota", "Camry", 2022);

        // Using methods to interact with the Car object
        myCar.start();
        myCar.drive(50);
        myCar.stop();
    }
}

// A class representing a Car
class Car {
    private String make;
    private String model;
    private int year;

    // Constructor to initialize the Car object
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to start the car
    public void start() {
        System.out.println("The " + year + " " + make + " " + model + " is starting.");
    }

    // Method to drive the car for a specified distance
    public void drive(int distance) {
        System.out.println("Driving for " + distance + " miles.");
    }

    // Method to stop the car
    public void stop() {
        System.out.println("The " + year + " " + make + " " + model + " has stopped.");
    }
}