package Polymorphism.MethodOverloading;

public class TypePromotion {
    void show(int a){
        System.out.println("int method");
    }
    void show(String a){
        System.out.println("String method");
    }

    public static void main(String[] args) {
        TypePromotion obj = new TypePromotion();
        obj.show('a');       // char value is passed
    }
}
