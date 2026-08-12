package WhileLoop;
import java.util.Scanner;

public class ArmstrongNumber {
    int num,z,sum=0,prod,count=0,digit;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        num = sc.nextInt();
        z=num;
    }

    void check(){
        //to find total no of digits in a number....
        while(z>0){
            count++;
            z=z/10;
        }
    }

    void putdata(){
        //each digit and logic........
        z=num;
        while(z>0){
            prod=1;
            digit=z%10;
            for(int i=1;i<=count;i++){
                prod=prod*digit;
            }
            sum=sum+prod;
            z=z/10;
        }
        if(sum==num){
            System.out.println("Armstrong number.");
        }
        else{
            System.out.println("Not Armstrong Number.");
        }
    }

    public static void main(String[] args) {
        ArmstrongNumber obj = new ArmstrongNumber();
        obj.getdata();
        obj.check();
        obj.putdata();
    }
}
