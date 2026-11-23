package ExceptionHandling;
import java.util.Scanner;

public class DivideByZeroException {
   public static void main(String[] args) {
        int numerator,denominator;

        Scanner sc= new Scanner(System.in);
       System.out.println("Enter numerator:");
       numerator=sc.nextInt();
       System.out.println("Enter denominator:");
       denominator=sc.nextInt();

       try{
           int result=numerator/denominator;
           System.out.println("Division:"+ result);
       }
       catch(ArithmeticException e){
           System.out.println("Cannot divide by zero.");
       }
    }
}
