package Abstraction;

abstract class MyTest{
    abstract void Calculate(int a, int b);
}

class Addition extends MyTest{
    void Calculate(int a,int b){
        int sum=a+b;
        System.out.println("Addition of a & b:"+sum);
    }
}

class Subtraction extends MyTest{
    void Calculate(int a,int b){
        int sub=a-b;
        System.out.println("Subtraction of a & b :"+sub);
    }
}
class Multiplication extends MyTest{
    void Calculate(int a,int b){
        int mul=a*b;
        System.out.println("Multiplication of a & b :"+mul);
    }
}

class Division extends MyTest{
    void Calculate(int a,int b){
        int div=a/b;
        System.out.println("Division of a & b:"+div);
    }
}

public class MyClass {
    public static void main(String[] args) {
        Addition a= new Addition();
        Subtraction s= new Subtraction();
        Multiplication m= new Multiplication();
        Division d=new Division();

        a.Calculate(10,5);
        s.Calculate(10,5);
        m.Calculate(10,5);
        d.Calculate(10,5);
    }
}
