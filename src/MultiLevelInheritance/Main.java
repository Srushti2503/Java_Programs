package MultiLevelInheritance;

class A{
    void methodA(){
        System.out.println("A class method..");
    }

}

class B extends A{
    void methodB(){
        System.out.println("B class method..");
    }

}

class C extends B{
    void methodC(){
        System.out.println("C class method..");
    }

}
public class Main {
    public static void main(String[] args) {
        C c= new C();
        c.methodA();
        c.methodB();
        c.methodA();

    }
}
