package ifelseStatements;

import java.util.Scanner;

public class EvenOdd {
    int num;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check:");
        num=sc.nextInt();

    }

    void putdata(){
        if(num%2==0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd Number.");
        }
    }

    static void main(String[] args) {
        EvenOdd aa= new EvenOdd();
        aa.getdata();
        aa.putdata();
    }


}

