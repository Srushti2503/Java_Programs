package Abstraction;

abstract class Hello{
    public void msg1(){
        System.out.println("msg-1 Hello.");
    }

    public abstract void msg2();
}
public class Test extends Hello{

    public void msg2(){
        System.out.println("msg-2 Hi.");
    }

    public static void main(String[] args) {
        Test t= new Test();
        t.msg1();
        t.msg2();
    }
}
