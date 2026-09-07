package ExceptionHandling.FinallyBlock;

public class FinallyKeyword {
    public static void main(String[] args) {
        int a=20;
        int b=0;
        try{
            System.out.println("Value of A:"+a);
            System.out.println("Value of B:"+b);
            int d=a/b;
            System.out.println("Division :"+d);
        }
        catch(ArithmeticException e){
            System.out.println("No cannot be divided by zero.");
        }
        finally{
            System.out.println("I am in finally block.");
        }
    }
}
