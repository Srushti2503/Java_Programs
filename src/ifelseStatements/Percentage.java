package ifelseStatements;

import java.util.Scanner;

public class Percentage {
    int phy,chem,math,bio,history,total,percent;


    //user input marks
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of physics:");
        phy=sc.nextInt();
        System.out.println("Enter marks of chemistry:");
        chem=sc.nextInt();
        System.out.println("Enter marks of biology:");
        bio=sc.nextInt();
        System.out.println("Enter marks of Mathematics:");
        math=sc.nextInt();
        System.out.println("Enter marks of history:");
        history=sc.nextInt();
    }

    //calculation & output..
    void putdata(){
        total=phy+chem+bio+math+history;
        percent=total/5;
        if(percent>=90){
            System.out.println("O grade");
        }
        else if(percent>=80){
            System.out.println("A grade");
        }
        else if(percent>=70){
            System.out.println("B grade");
        }
        else if(percent>=60){
            System.out.println("C grade");
        }
        else if(percent>=50){
            System.out.println("D grade");
        }
        else{
            System.out.println("Failed");
        }

    }

    static void main(String[] args) {
       Percentage aa= new Percentage();
        aa.getdata();
        aa.putdata();
    }
}
