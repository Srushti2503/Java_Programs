package ifelseStatements;
import java.util.Scanner;

public class MaxThreeNumbers {
    int num1,num2,num3;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd no:");
        num2=sc.nextInt();
        System.out.println("Enter 3rd no:");
        num3 = sc.nextInt();
        sc.close();
    }

    void putdata(){
        if(num1>num2 && num1>num3){
            System.out.println("Max no:"+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Max no:"+num2);
        }
        else{
            System.out.println("Max no:"+num3);
        }
    }

    public static void main(String[] args) {
        MaxThreeNumbers obj = new MaxThreeNumbers();
        obj.getdata();
        obj.putdata();
    }
}
