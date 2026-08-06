package Inheritance.HasARelationship;

class Address{
    String city;
    String state;

    //constructor...
    Address(String city,String state){
        this.city=city;
        this.state=state;
    }

    //method....
    void displayAddress(){
        System.out.println("Address:"+city+"("+state+")");
    }
}

class Student{
    String name;
    int rollno;

    //constructor...

    Student(String name,int rollno){
        this.name=name;
        this.rollno=rollno;
    }

    //creating object of upper class...
    Address aa= new Address("Pune","Maharashtra");

    //method....
    void displayStdInfo(){
        System.out.println("Name :"+name);
        System.out.println("Roll Number:"+rollno);
        aa.displayAddress();

    }
}

public class Demo {
    public static void main(String[] args) {
        Student std= new Student("Srushti",101);
        std.displayStdInfo();
    }

}
