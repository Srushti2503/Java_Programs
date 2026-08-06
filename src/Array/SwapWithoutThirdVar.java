package Array;
import java.util.Scanner;

public class SwapWithoutThirdVar {
    int num1,num2,temp;

    void getdata(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st no:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd no:");
        num2=sc.nextInt();
        sc.close();
    }

    void putdata() {
        System.out.println("1st no before swappning:" + num1);
        System.out.println("2nd no before swappning:" + num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("1st no after swappning:"+num1);
        System.out.println("2nd no after swappning:"+num2);
    }

    public static void main(String[] args) {
        SwapWithoutThirdVar obj = new SwapWithoutThirdVar();
        obj.getdata();
        obj.putdata();
    }
    }
