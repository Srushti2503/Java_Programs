package Polymorphism;

public class Addition {

    void sum(int a,int b){
        int s=a+b;
        System.out.println("Addition of two numbers:"+s);
    }

    void sum(int a,int b, int c){
        int s=a+b+c;
        System.out.println("Addition of three numbers:"+s);
    }

    public static void main(String[] args) {
        Addition aa= new    Addition();
        aa.sum(5,6);
        aa.sum(5,5,1);
    }
}
