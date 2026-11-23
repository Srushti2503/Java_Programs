//Create a constructor reference using Supplier.

package Java8.MethodReference;
import java.util.function.Supplier;

class Student1 {

    Student1() {
        System.out.println("Student object created");
    }
}

public class  ConstructorReference{
    public static void main(String[] args) {

        Supplier<Student1> obj = Student1::new;

        Student1 s = obj.get();
    }
}