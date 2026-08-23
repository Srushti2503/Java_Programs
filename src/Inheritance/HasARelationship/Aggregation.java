package Inheritance.HasARelationship;

class Department{
    String deptName;

    Department(String deptName){
        this.deptName=deptName;
    }
}

class Employee{
    String empName;
    Department department;          //aggregation

    Employee(String empName , Department department){
        this.empName=empName;
        this.department=department;
    }

    void display(){
        System.out.println("Employee Name:"+empName);
        System.out.println("Department Name:"+department.deptName);
    }
}


public class Aggregation {
    public static void main(String[] args) {

        Department dept= new Department("IT");


        Employee emp= new Employee("Srushti", dept);
        emp.display();
    }
}
