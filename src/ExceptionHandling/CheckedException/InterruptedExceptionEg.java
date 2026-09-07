package ExceptionHandling.CheckedException;

public class InterruptedExceptionEg {
    public static void main(String[] args) {
        System.out.println("Hello world");
        try{
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
