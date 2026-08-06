package Exercise1;

class Demo{
    void show(){
        System.out.println("Hello everyone..");
    }
}
class Example extends Demo{
    void show(){
        System.out.println("I am srushti auti");
    }
}
public class MethodOverridingEg {
    public static void main(String[] args) {
        Example e= new Example();
        e.show();
    }
}
