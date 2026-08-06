package SingleInheritance;

/*Create a class Mobile with brand and price.
Create a class Smartphone with cameraMP.

 */

public class Mobile {
    String brand= "IPhone";
    int price=70000;

    void display(){
        System.out.println("Brand of Mobile phone:"+brand);
        System.out.println("Price of mobile phone:"+price);
    }

    public static void main(String[] args) {
        Smartphone aa= new Smartphone();
        aa.display();
        aa.displaySmartPhone();
    }
}

class Smartphone extends Mobile {
    int cameraMP = 50;

    void displaySmartPhone() {
        System.out.println("Camera MP:" + cameraMP);
    }
}

