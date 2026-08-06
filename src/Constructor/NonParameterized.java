package Constructor;

public class NonParameterized {
    String name;
    int age;
    int rollno;

    NonParameterized(){
        name="Srushti";
        age=22;
        rollno=101;
    }

    void putdata(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Roll Number:"+rollno);
    }

    static void main(String[] args) {
        NonParameterized aa= new NonParameterized();
        aa.putdata();
    }
}
