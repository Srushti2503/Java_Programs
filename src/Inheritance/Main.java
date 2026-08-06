package Inheritance;

class Animals{
    void makeSound(){
        System.out.println("Animal makes sound..");
    }
}

class Dogs extends Animals{

    void makeSound(){
        System.out.println("Dogs also make sound..");
    }

    void bark(){
        System.out.println("Dog barks..");
    }

}
public class Main {
    static void main(String[] args) {
        Animals aa= new Animals();
        aa.makeSound();
        Dogs g= new Dogs();
        g.makeSound();
        g.bark();
    }
}
