package ExceptionHandling.ThrowKeyword;

public class ThrowTest1 {
    public static void main(String[] args) {
        try
        {
            ArithmeticException a = new ArithmeticException("Hello from throw");
            throw a;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("ArithmeticException caught: \n" +ae);
            System.out.println(ae.getMessage());
        }
    }
}