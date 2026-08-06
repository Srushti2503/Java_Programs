package Constructor;
import java.util.*;

public class ParameterizeConstructor {
    String name;
    int id,rollno,age;

    public ParameterizeConstructor(String name,int id,int rollno,int age){
        this.name=name;
        this.id=id;
        this.rollno=rollno;
        this.age=age;
    }
    void display(){
        System.out.println("Name:"+name);
        System.out.println("ID:"+id);
        System.out.println("Roll Number:"+ rollno);
        System.out.println("Age:"+ age);
    }

    static void main(String[] args) {
        String m;
        int n,o,p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        m=sc.next();
        System.out.println("Enter your ID:");
        n =sc.nextInt();
        System.out.println("Enter your Roll Number:");
        o=sc.nextInt();
        System.out.println("Enter your Age:");
        p=sc.nextInt();

        ParameterizeConstructor aa = new ParameterizeConstructor(m,n,o,p);
        aa.display();


    }
}


/*or
static void main(String[] args) {
   ParamterizeConstructor aa= new ParameterizeConstructor("Srushti",101,201,22);
}*/