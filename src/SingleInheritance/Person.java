package SingleInheritance;

/*Create a class Person with attributes name and age.
Create a class Student that adds rollNo and displayDetails().
 */
public class Person {
    void name(){
        System.out.println("Hello World, Srushti Here");
    }
    void age(){
        System.out.println("I am 22 years old");
    }
    public static void main(String args[]){
        Student aa= new Student();
        aa.name();
        aa.age();
        aa.rollNo();
        aa.displayDetails();
    }
}
class Student extends Person {
    void rollNo(){
        System.out.println("Roll Number=101");
    }
    void displayDetails(){
        System.out.println("Details are as shown");
    }

}

