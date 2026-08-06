package SingleInheritance;

/*Create a class Animal with method eat().
Create a child class Dog that adds method bark().package Inheritance;*/
public class Animal{
    void eat(){
        System.out.println("Animal Eat");
    }
    public static void main(String args[]){
        Dog aa= new Dog();
        aa.eat();
        aa.bark();
    }
}
class Dog extends Animal {
    void bark(){
        System.out.println("Animal Barks");
    }

}

