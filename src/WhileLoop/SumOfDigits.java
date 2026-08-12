package WhileLoop;
import java.util.Scanner;

public class SumOfDigits {
    int num,sum=0;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to find sum of its digits:");
        num = sc.nextInt();
    }

    void putdata(){
        while(num>0){
            sum = sum+(num%10);
            num= num/10;
        }
        System.out.println("Sum of digits of a given no:"+sum);
    }

    public static void main(String[] args) {
        SumOfDigits obj = new SumOfDigits();
        obj.getdata();
        obj.putdata();
    }
}
