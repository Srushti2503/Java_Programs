package ifelseStatements;

import java.util.Scanner;

public class Divisible {
    int num1,num2;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check whether it is divisible or not:");
        num1=sc.nextInt();
        System.out.println("Enter the divisor:");
        num2=sc.nextInt();

    }
    void putdata(){
        if(num1%num2==0){
            System.out.println(num1+" is divisible by "+num2);
        }
        else
            System.out.println(num1 +" is not divisible by "+num2);
    }

    static void main(String[] args) {
        Divisible aa = new Divisible();
        aa.getdata();
        aa.putdata();
    }
}

