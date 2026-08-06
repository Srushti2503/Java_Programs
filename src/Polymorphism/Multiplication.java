package Polymorphism;

public class Multiplication {

    void mul(double x,int y){
        double m=x*y;
        System.out.println("Multiplication of two nos:"+m);
    }

   void mul( int x,double y){
        double m=x*y;
        System.out.println("Multiplication:"+m);
    }

    public static void main(String[] args) {
        Multiplication m= new Multiplication();
        m.mul(10.0,5);
        m.mul(5,10.0);
    }
}
