package ExceptionHandling.UnCheckedException;

public class ArithmeticExceptEg {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("Before Divide:");
        try{
            int x=1/0;
            System.out.println("After divide.");
        }
        catch(ArithmeticException e){
            System.out.println("A number cannot be divided by zero.");
        }
        System.out.println("End Of Program.");
    }
}
