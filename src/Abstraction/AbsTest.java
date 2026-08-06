package Abstraction;

abstract class AbstractClass{
    int x=10;

    AbstractClass(){
        System.out.println("AbstractClass Constructor..");
    }
    final void m1(){
        System.out.println("Final method of AbstractClass.");
    }
    void m2(){
        System.out.println("concrete method of AbstractClass.");
    }
    static void m3(){
        System.out.println("Static method od AbstractClass.");
    }
    abstract void m4();
}
public class AbsTest extends AbstractClass {

    AbsTest(){
        System.out.println("AbsTest class constructor.");
    }

    void m4(){
        System.out.println("Hello everyone.");
    }

    public static void main(String[] args) {
        AbsTest ab= new AbsTest();
        ab.m2();
        ab.m4();
        System.out.println("value of X:"+ ab.x);
    }
}
