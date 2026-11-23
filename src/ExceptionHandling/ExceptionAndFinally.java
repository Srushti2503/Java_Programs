package ExceptionHandling;

public class ExceptionAndFinally {
    public static void main(String[] args) {

        try{
            int x=10/0;
        }
        catch(ArithmeticException e){
            System.out.println("Catch Block");
        }
        finally{
            System.out.println("Finally Block");
        }
        System.out.println("After finally.");
    }
}
