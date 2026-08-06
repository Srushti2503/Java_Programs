package SingleInheritance;

/*Create a class Appliance with method turnOn().
Create a class WashingMachine with method washClothes().

 */


public class Appliance {
    void turnon(){
        System.out.println("Appliance is turning on");
    }

    public static void main(String[] args) {
        WashingMachine aa= new WashingMachine();
        aa.turnon();
        aa.washClothes();
    }
}
class WashingMachine extends Appliance {
    void washClothes(){
        System.out.println("Washing machine is used to wash clothes...");
    }
}

