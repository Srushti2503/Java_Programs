package SingleInheritance;

class A{
    void methodA(){
        System.out.println("Base class method..");
    }
}

class B extends A{
    void methodB(){
        System.out.println("Derived class method..");
    }
}
public class MyClass {
    public static void main(String args[]){
        B b=new B();
        b.methodA();
        b.methodB();
    }
}
