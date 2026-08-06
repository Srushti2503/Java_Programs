package Inheritance;

class Vehicle{
    String brand;

    Vehicle(String brand){
        this.brand=brand;
    }

    void honk(){
        System.out.println("Honk Honk!");
    }
}

class Car extends Vehicle{
    String model;

    Car(String brand,String model){
        super(brand);
        this.model=model;
    }

    void drive(){
        System.out.println("Driving the "+ brand +" "+model);
    }
}
class Bicycle extends Vehicle{

    Bicycle(String brand){
        super(brand);
    }
    void pedal(){
        System.out.println("Peadling the "+brand+ " bicycle");
    }
}
public class MultiClases {
    static void main(String[] args) {
        Bicycle aa= new Bicycle("Schwinn");
        aa.honk();
        aa.pedal();

        System.out.println();

        Car c= new Car("Toyoto","Corola");
        c.honk();
        c.drive();

    }
}
