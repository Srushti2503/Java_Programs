package ExceptionHandling.UnCheckedException;

public class ArithmeticExceptionEg {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        try{
            int sum=a/b;
            System.out.println("Sum:"+sum);
        }
        catch(ArithmeticException e){
            System.out.println("A number cannot be divided by zero");
        }
    }
}
