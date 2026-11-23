//Create an instance method reference using an existing Student object.
package Java8.MethodReference;

interface StudentDetails {
    void display();
}

class Student {

    void show() {
        System.out.println("Student name: Rahul");
    }
}

public class InstanceMethodReference {
    public static void main(String[] args) {

        Student s = new Student();

        StudentDetails obj = s::show;

        obj.display();
    }
}
