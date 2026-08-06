package Polymorphism;

public class Subtraction {

    void sub(int x,int y){
        int s=x-y;
        System.out.println("Subtraction of two numbers:"+s);
    }

    double sub(double x,double y){
        double s=x-y;
        System.out.println("Subtraction of two nos:"+s);
        return s;
    }

    static void main(String[] args) {
        Subtraction s= new Subtraction();
        s.sub(10,5);
        s.sub(10.0 ,5.0);


    }
}
