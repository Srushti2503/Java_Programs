package objectInitialization;


//object initialization using reference variable....
public class Students {
    String name;
    int age,rollno;

    public static void main(String[] args) {
        Students aa= new Students();
        aa.name="Srushti";
        aa.age=22;
        aa.rollno=101;
        System.out.println("Name:"+aa.name);
        System.out.println("Age:"+aa.age);
        System.out.println("Rollno:"+aa.rollno);

    }
}
