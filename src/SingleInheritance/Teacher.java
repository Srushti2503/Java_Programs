package SingleInheritance;

/*Create a class Teacher with method teach().
Create a class MathTeacher with method solveProblem().

 */

public class Teacher {
    void teach(){
        System.out.println("Teacher teaches..");
    }

    static void main(String[] args) {
        MathTeacher aa= new MathTeacher();
        aa.teach();
        aa.solveProblem();
    }
}
class MathTeacher extends Teacher {
    void solveProblem(){
        System.out.println("Math teacher solves problems...");
    }
}

