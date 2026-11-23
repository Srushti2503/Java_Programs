package Java8.LambdaExpression;

public class RunnableUsingLambda {
    public static void main(String[] args) {

        Runnable r=()->{
            System.out.println("Implementing runnable using lambda");
        };

        Thread t=new Thread(r);
        t.start();
    }
}
