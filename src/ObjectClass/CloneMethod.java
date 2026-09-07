package ObjectClass;

public class CloneMethod implements Cloneable {

    int x, y;

    // Constructor
    CloneMethod() {
        x = 10;
        y = 20;
    }

    // Overriding clone()
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

class Main {

    public static void main(String[] args)
            throws CloneNotSupportedException {

        CloneMethod o1 = new CloneMethod();

        // Clone o1 into o2
        CloneMethod o2 = (CloneMethod) o1.clone();

        System.out.println("o1: " + o1.x + " " + o1.y);
        System.out.println("o2: " + o2.x + " " + o2.y);

        System.out.println(o1 == o2);
    }
}

//The object o1 is cloned using the clone() method, creating a new object o2 with the same field values. Although
// both objects contain identical data, they occupy different memory locations.