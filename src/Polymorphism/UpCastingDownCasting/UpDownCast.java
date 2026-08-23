package Polymorphism.UpCastingDownCasting;

class Parent{
    void show(){
        System.out.println("Parent class method.");
    }
}
class Child extends Parent{
    void show(){
        super.show();
        System.out.println("Child class method.");
    }
}
public class UpDownCast {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.show();
    }
}
