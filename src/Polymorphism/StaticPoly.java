package Polymorphism;

public class StaticPoly {

    void Sum(int x,int y){
        int s=x+y;
        System.out.println("Sum of two numbers:"+s);
    }

    void Sum(int x,int y,int z){
        int s=x+y+z;
        System.out.println("Sum of three numbers:"+s);
    }

    public static void main(String[] args) {
        StaticPoly aa= new  StaticPoly();
        aa.Sum(5,6);
        aa.Sum(5,4,1);


    }
}
