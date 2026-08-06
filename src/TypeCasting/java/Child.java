//upcasting in cqase of method overridding....
package TypeCasting.java;

class Parent{
    void show(){
        System.out.println("Parent class method..");
    }
}
public class Child extends Parent {
    void show(){
        System.out.println("Child class method..");
    }

    public static void main(String[] args) {
        Parent obj= new Child();
        obj.show();
    }
}

