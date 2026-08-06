package Continue;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args)
    {
        int num = 0, sum = 0;


        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Enter an integer number: ");
            num = sc.nextInt();
            sum = sum + num;
        } while(num != 0);
        System.out.println("Sum of numbers: " +sum);
    }
}