package HierarchicalInheritance;

class A{
    void m1(){
        System.out.println("Method 1");
    }

}

class B extends A{
    void m2(){
        System.out.println("Method m2");
    }

}

class C extends A{
    void m3(){
        System.out.println("Method 3");
    }

}

class D extends A{
    void m4(){
        System.out.println("Method 4");
    }
}

public class MyClass {
    public static void main(String[] args) {
        B b= new B();
        b.m1();
        b.m2();
        System.out.println();

        C c= new C();
        c.m1();
        c.m3();
        System.out.println();

        D d= new D();
        d.m1();
        d.m4();
    }
}
