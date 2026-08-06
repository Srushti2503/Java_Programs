package Inheritance;

class Parent{
    void show(){
        System.out.println("Parent class method...");
    }
}
public class Child extends Parent{

    void showdata(){
        super.show();
        System.out.println("Child class method...");
    }

    static void main(String[] args) {
        Child obj= new Child();
        obj.showdata();
//        obj.show();
    }
}
