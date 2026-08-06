package Interface;

interface Outer{
    void m1();

    interface Inner{
        void m2();
    }
}
class MyClass1 implements Outer{
    public void m1(){
        System.out.println("Hello everyone.");
    }
}

class MyClass2 implements Outer.Inner{

    public void m2(){
        System.out.println("Welcome to Java.");
    }
}
public class Example {
    public static void main(String[] args) {
        MyClass1 aa= new MyClass1();
        aa.m1();

        MyClass2 bb= new MyClass2();
        bb.m2();
    }


}
