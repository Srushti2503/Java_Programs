package ExceptionHandling;

public class ExceptionPropogation {

    static void method3(){
        int x=10/0;
        System.out.println("Division:"+x);
    }

    static void method2(){
        method3();
    }

    static void method1(){
        method2();
    }

    public static void main(String[] args) {
        try{
            method1();
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
    }
}
