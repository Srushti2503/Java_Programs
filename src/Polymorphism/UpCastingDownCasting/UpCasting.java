package Polymorphism.UpCastingDownCasting;

class A{
    void show(){
        System.out.println("Class A method");
    }
}

class B extends A{
    void display(){
        System.out.println("Class B method");
    }
}
public class UpCasting {
    public static void main(String[] args) {
        A obj =new B();
        obj.show();
    }
}
