package ifelseStatements;

import java.util.Scanner;

public class Buzz {
    int num;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check whether it is buzz or not:");
        num= sc.nextInt();
    }

    void putdata(){
        if(num%10==7 || num%7==0){
            System.out.println("Buzz Number.");
        }
        else{
            System.out.println("Not Buzz Number.");
        }
    }

    public static void main(String[] args) {
        Buzz buzz = new Buzz();
        buzz.getdata();
        buzz.putdata();
    }


}
