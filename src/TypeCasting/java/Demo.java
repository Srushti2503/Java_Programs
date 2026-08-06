//DownCasting...
package TypeCasting.java;

class AB{
    void show(){
        System.out.println("Parent class method..");
    }
}

class CD extends AB{
    void display(){
        System.out.println("Child class method..");
    }
}
public class Demo {
    public static void main(String[] args) {
        AB obj= new CD();
        CD c= (CD) obj;
        c.show();
        c.display();
    }
}
