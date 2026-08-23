package Inheritance;

// Define the Engine class.
class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public void start() {
        System.out.println("Engine started.");
    }

    public void stop() {
        System.out.println("Engine stopped.");
    }
}

// Define the Car class using composition
class Car {
    private String model;
    private Engine engine; // Has-A relationship with Engine

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
    }

    public void startCar() {
        System.out.println("Starting the car with model: " + model);
        engine.start();
    }

    public void stopCar() {
        System.out.println("Stopping the car with model: " + model);
        engine.stop();
    }
}

public class Main2 {
    public static void main(String[] args)
    {
        // Create an Engine instance.
        Engine carEngine = new Engine("V6");

        // Create a Car instance with the Engine instance.
        Car myCar = new Car("Sedan", carEngine);

        // Call methods to start and stop car.
        myCar.startCar();
        myCar.stopCar();
    }
}

