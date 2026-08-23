package Polymorphism.MethodOverloading;

public class Varargs {
    void show(int a){
        System.out.println("int method.");
    }
    void show(int ...a){
        System.out.println("Varargs method;");
    }

    public static void main(String[] args) {
        Varargs obj = new Varargs();
        obj.show(5,6,7,7);
    }
}
