package ifelseStatements;
import java.util.Scanner;

public class MaxTwoNumbers {
    int num1,num2;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd no:");
        num2=sc.nextInt();
        sc.close();
    }

    void putdata(){
        if(num1>num2){
            System.out.println("Max no:"+num1);
        }
        else{
            System.out.println("Max no:"+num2);
        }
    }

    public static void main(String[] args) {
        MaxTwoNumbers obj= new MaxTwoNumbers();
        obj.getdata();
        obj.putdata();
    }

}
