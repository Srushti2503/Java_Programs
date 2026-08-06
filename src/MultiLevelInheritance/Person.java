package MultiLevelInheritance;

/*Create class Person1 → Employee1 → Manager1
Add attributes and display full details.

 */
import java.util.Scanner;


public class Person {
    String name;
    int age;
    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.next();
        System.out.println("Enter your age:");
        age=sc.nextInt();
    }

    void showdata(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    static void main(String[] args) {
        Manager aa= new Manager();
        aa.getdata();
        aa.showdata();
        aa.putdata();
        aa.showSalary();
    }

}
class Employee extends Person {
    int employee_id=101;
    void putdata(){
        System.out.println("Employee id:"+employee_id);
    }

}
class Manager extends Employee {
    int salary=50000;
    void showSalary(){
        System.out.println("Salary of Person who is also a manager:"+salary);
    }

}

