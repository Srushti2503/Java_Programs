package MultiLevelInheritance;


/*Create class Building → House → SmartHouse
Add methods like openDoor(), controlDevices().

 */


public class Building {
    void openDoor() {
        System.out.println("Door is opened");
    }
    public static void main(String[] args) {
         SmartHouse sh = new SmartHouse();

        sh.openDoor();
        sh.rooms();
        sh.controlDevices();
    }
}

class House extends Building {
    void rooms() {
        System.out.println("House has multiple rooms");
    }
}


class SmartHouse extends House {
    void controlDevices() {
        System.out.println("Controlling devices automatically");
    }
}


