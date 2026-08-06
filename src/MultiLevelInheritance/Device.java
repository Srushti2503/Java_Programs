package MultiLevelInheritance;

/*Create class Device → Computer → Laptop
Add methods like process(), portable().

 */

public class Device {
    void process() {
        System.out.println("Device is processing data");
    }

    public static void main(String[] args) {
        Laptop lp = new Laptop();

        lp.process();
        lp.compute();
        lp.portable();
    }
}


class Computer extends Device {
    void compute() {
        System.out.println("Computer performs computations");
    }
}


class Laptop extends Computer {
    void portable() {
        System.out.println("Laptop is portable");
    }
}


