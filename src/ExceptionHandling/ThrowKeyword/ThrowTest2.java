package ExceptionHandling.ThrowKeyword;

public class ThrowTest2 {
    public static void main(String[] args)
    {
        int x = 20;
        int y = 0;
        try
        {
            int z = x/y; // Exception occurred. // Line 9
            System.out.println("Result: " +z); // Line 10
            throw new ArithmeticException();
        }
        catch(ArithmeticException ae) {
            System.out.println("Exception caught: \n" +ae);
        }
    }
}
