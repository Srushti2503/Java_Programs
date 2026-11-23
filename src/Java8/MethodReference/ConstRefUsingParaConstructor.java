//Create a constructor reference using Function for a parameterized constructor.

package Java8.MethodReference;

import java.util.function.Function;

class Students{

    String name;

    Students(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student name: " + name);
    }
}

public class ConstRefUsingParaConstructor {
    public static void main(String[] args) {

        Function<String, Students> obj = Students::new;

        Students s = obj.apply("Rahul");

        s.display();
    }
}