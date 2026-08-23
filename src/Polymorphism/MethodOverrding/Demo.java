package Polymorphism.MethodOverrding;

class Test{
    void show(){
        System.out.println("Parent class method.");
    }
}
class Child extends Test{
    void show(){
        System.out.println("Child class method.");
    }
}
public class Demo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }

}
