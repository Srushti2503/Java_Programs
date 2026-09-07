package ObjectClass;

public class Person{

    String n;

    // Constructor
    public Person(String n) {
        this.n = n;
    }

    // Override toString() for a
    // custom string representation
    @Override
    public String toString() {
        return "Person{name:'" + n + "'}";
    }

    public static void main(String[] args) {

        Person p = new Person("Geek");

        // Custom string representation
        System.out.println(p.toString());

        // Default hash code value
        System.out.println(p.hashCode());
    }
}

//Explanation: In the above example, we override the toString() method to provide a custom string representation of
// the Person class and use the hashCode() method to display the default hash code value of the object.