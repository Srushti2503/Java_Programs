package Encapsulation;

//Program for getter(Read only).....

class Employee{
    private String name;
    private int id;
    private String ncompany;

    Employee(String name,int id,String ncompany){
        this.name=name;
        this.id=id;
        this.ncompany=ncompany;
    }

    //getters.........
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }

    public String getNcompany(){
        return ncompany;
    }


}
public class ReadOnlyTest {
    static void main(String[] args) {
    Employee aa= new Employee("Srushti",101,"TCS");

    String Name=aa.getName();
    int ID =aa.getId();
    String company_Name=aa.getNcompany();


    System.out.println("Name of employee:"+Name);
        System.out.println("ID of company:"+ID);
        System.out.println("Name of company:"+company_Name);

    }
}
