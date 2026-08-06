package SuperKeyword;

class Student{
    int x=10;

    void StudentInfo() {
        System.out.println("Student Information...");
    }
}

public class School extends Student{

    void StudentInfo(){
        super.StudentInfo();
        System.out.println("School Information...");
    }

    void show(){
        System.out.println("Good morning everyone...");
    }

    public static void main(String[] args) {
        School sc = new School();
        sc.StudentInfo();
        sc.show();
    }
}
