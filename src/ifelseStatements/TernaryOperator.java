package ifelseStatements;

public class TernaryOperator {

    int marks=40;

    void putdata(){
        System.out.println(marks>=40 ? "Pass" : "fail");
    }

    static void main(String[] args) {
        TernaryOperator to= new TernaryOperator();
        to.putdata();
    }
}
