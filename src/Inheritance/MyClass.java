package Inheritance;


class A{
    int a=10;

    A(){
        System.out.println("Constructor of class A.");
    }
    static{
        System.out.println("Static block of class A.");
    }

    {
        System.out.println("Instance block of class A.");
    }
}

class B extends A{
    int b=20;

    B(){
        System.out.println("Constructor of class B.");
    }
    static{
        System.out.println("Static block of class B.");
    }
    {
        System.out.println("Instance block of class B.");
    }
}
public class MyClass {
    static void main(String[] args) {
        B b=new B();
        System.out.println(b.a);
        System.out.println(b.b);
    }
}

