package objectInitialization;

//object initialization using mthod.......

public class Student {
String name;
int age,rollno;

    public static void main(String[] args) {
        Student aa= new Student();
        aa.name="Srushti";
        aa.age=22;
        aa.rollno=101;
        aa.display();
    }

    //method through call........
        void display() {
            System.out.println("name:" + name);
            System.out.println("Rollno:" + rollno);
            System.out.println("Age:" + age);

        }
}
