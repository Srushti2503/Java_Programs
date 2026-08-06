//widening.....
package TypeCasting.java;
class A{
    void show(){
        System.out.println("Parent class method..");
    }
}

class B extends A{
    void display(){
        System.out.println("Child class method..");
    }
}
public class test {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();
//        obj.display();    it will give error...

    }

}
