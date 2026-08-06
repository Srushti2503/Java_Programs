package Has_A_Relation;

// Define the Address class
class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    // Define a constructor.
    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public String getAddressInfo() {
        return street + ", " + city + ", " + state + " " + zipCode;
    }
}
// Define the Person class using composition
class Person {
    private String name;
    private Address address; // Has-A relationship with Address

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    public String getPersonInfo() {
        return "Name: " + name + "\nAddress: " + address.getAddressInfo();
    }
}
public class Main {
    public static void main(String[] args)
    {
        // Create an Address instance.
        Address personAddress = new Address("123 Main St", "Cityville", "Stateville", "12345");

        // Create a Person instance with the Address instance.
        Person person = new Person("John Doe", personAddress);

        // Display person's information.
        System.out.println(person.getPersonInfo());
    }
}
