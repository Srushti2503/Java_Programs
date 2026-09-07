package ExceptionHandling;
import java.util.Scanner;

public class SumOfTwoInteger {
    public static void main(String[] args) {
        int num1,num2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 1st no:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd no:");
        num2=sc.nextInt();

        System.out.println(num1+ " / " + num2 + " : "+(num1/num2));
    }
}
