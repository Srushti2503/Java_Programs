package Polymorphism.MethodOverloading;

public class StringStringBuffer {
    void show(StringBuffer a){
        System.out.println("StringBuffer method.");
    }
    void show(String a){
        System.out.println("String method.");
    }

    public static void main(String[] args) {
        StringStringBuffer obj = new StringStringBuffer();
//        obj.show("abc");
        obj.show(new StringBuffer("XYZ"));
    }
}
