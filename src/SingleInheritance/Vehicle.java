package SingleInheritance;

/*Create a class Vehicle with method start().
Create a child class Car with method drive().
 */
public class Vehicle {
    void start(){
        System.out.println("Vehicle starts with button");
    }
    public static void main(String args[]){
        Car aa= new Car();
        aa.start();
        aa.drive();
    }

}
class Car extends Vehicle {
    void drive(){
        System.out.println("You can drive Car ");
    }

}

