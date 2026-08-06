package SingleInheritance;

/*Create a class Employee with salary.
Create a class Manager that adds bonus and prints total salary.

 */


public class Employee {
    int salary=30000;
    void salary(){
        System.out.println("This class calculates salary of employee...");
    }

    public static void main(String[] args) {
        Manager aa= new Manager();
        aa.salary();
        aa.Result();
    }
}
class Manager extends Employee {
    int bonus;
    void Result(){
        bonus=5000;
        System.out.println("Total salary:"+(salary+bonus));
    }

}

