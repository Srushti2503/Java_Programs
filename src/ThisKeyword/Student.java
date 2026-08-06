package ThisKeyword;

class School
{
    // Declare instance variables.
    String stName;
    int stRoll;
    int stId;
    School(String schoolName)
    {
        // This statement calls one parameter current class constructor by passing integer value within the same class.
        this(2);
        System.out.println("Student's Detail: ");
    }
    School(int s)
    {
        System.out.println("Delhi Public School");
    }
    School(String stName, int stRoll, int stId)
    {
        // This statement calls one parameter current class constructor by passing string argument within same class.
        this("DPS");
        this.stName = stName;
        this.stRoll = stRoll;
        this.stId = stId;
    }
    void display()
    {
        System.out.println("Name: " +stName);
        System.out.println("Roll no. : " +stRoll);
        System.out.println("Id: " +stId);
    }
}
// The extends keyword is used for developing inheritance between two classes.
public class Student extends School {
    Student()
    {
        // This statement calls super class constructor with passing three argument values.
        super("Shubh" , 2 , 2345);
    }
    Student(String schoolName)
    {
        this();
    }
    public static void main(String[] args) {
        // Create an object of the class School and pass string to its constructor.
        Student st = new Student("DPS");
        st.display();
    }
}
