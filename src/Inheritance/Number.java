package Inheritance;

public class Number {
    int x=20;
}
class Number2 extends Number{
    int x=30;

    void display(){
        System.out.println("Parent class number:"+super.x);
        System.out.println("Child class number:"+ x);
    }

    static void main(String[] args) {
        Number2 aa= new Number2();
        aa.display();
    }
}
