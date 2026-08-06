package MultiLevelInheritance;

/*Create class Animal → Mammal → Dogs
Add methods like eat(), walk(), bark().

 */

public class Animal {

    void eat(){
        System.out.println("Animals can eat.");
    }

    public static void main(String[] args) {
       Dog aa= new Dog();
        aa.eat();
        aa.walk();
        aa.bark();
    }

}
class Mammal extends Animal {
    void walk(){
        System.out.println("Mammal is used to talk");
    }
}

class Dog extends Mammal {
    void bark(){
        System.out.println("Dogs can bark");
    }

}
