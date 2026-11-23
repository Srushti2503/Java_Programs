package MultiThreading;

class MyClass implements Runnable{

    @Override
    public void run() {
        System.out.println("Task is running.");
    }
}
public class CreateThreadUsingRunnableInterface {

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        Thread t= new Thread(obj);
        t.start();
    }
}