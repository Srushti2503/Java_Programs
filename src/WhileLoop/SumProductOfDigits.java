package WhileLoop;
import java.util.Scanner;

public class SumProductOfDigits {
    int num,sum=0,prod=1;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to find Sum & Product:");
        num = sc.nextInt();
    }

    void putdata(){
        while(num>0){
            if(num%2==0){
                sum=sum+(num%10);
            }
            else{
                prod=prod*(num%10);
            }
            num=num/10;
        }
        System.out.println("Sum of even digits of a number:"+sum);
        System.out.println("Product of odd digits of a number:"+prod);
    }

    public static void main(String[] args) {
        SumProductOfDigits obj = new SumProductOfDigits();
        obj.getdata();
        obj.putdata();
    }
}
