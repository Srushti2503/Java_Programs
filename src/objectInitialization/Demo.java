package objectInitialization;

//object initialization using constructor.........

public class Demo {
   String name;
   int rollno,age;

   //constructor.........
    Demo(){
        name="Srushti";
        age=22;
        rollno=101;
    }
    void display(){
        System.out.println("Name of student:"+name);
        System.out.println("Age of student:"+age);
        System.out.println("Roll no of student:"+rollno);
    }

    public static void main(String[] args) {
        Demo d=new Demo();
        d.display();
    }

}
