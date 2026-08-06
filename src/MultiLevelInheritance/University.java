package MultiLevelInheritance;

/*Create class University → College → Department
Store and display hierarchy details.

 */
public class University {
    String university_name="SPPU";

    void show(){
        System.out.println("University name:"+university_name);
    }

    static void main(String[] args) {
      Department aa= new Department();
        aa.show();
        aa.cname();
        aa.dept();
    }
}
class College extends University {
    String college_name ="SKNCOE";
    void cname(){
        System.out.println("College name:"+college_name);
    }
}
class Department extends College {
    String dept_name="ENTC";
    void dept(){
        System.out.println("Department name:"+dept_name);
    }
}

