package Polymorphism;


class Demo{
    void show(){
        System.out.println("Hello Everyone..");
    }
}
public class DynamicPoly {

    void show(){
        System.out.println("Good morning..");
    }

    public static void main(String[] args) {
        Demo aa= new Demo();
        aa.show();

        DynamicPoly ab= new DynamicPoly();
        ab.show();
    }
}
