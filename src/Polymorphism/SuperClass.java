//method overloading in subclass superclass...
package Polymorphism;

public class SuperClass {

    void sum(int x,int y){
        int s=x+y;
        System.out.println("Addition of X & y:"+s);
    }
}
class SubClass extends SuperClass{
    void sum(double x,double y){
        double s=x+y;
        System.out.println("Addition of X & y:"+s);
    }

    public static void main(String[] args) {
        SuperClass sc= new SuperClass();
        sc.sum(10,5);


        SubClass sc1= new SubClass();
        sc1.sum(10.2 ,4.8);
    }
}
