package Exercise1;

public class MethodCalling {
    void method1(){
        System.out.println("First method..");
    }

    void method2(){
        System.out.println("Second Method..");
        method1();
    }

    public static void main(String[] args) {
        MethodCalling m= new MethodCalling();
        m.method2();
    }
}
