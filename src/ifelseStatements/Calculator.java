package ifelseStatements;
import java.util.Scanner;

public class Calculator {
    int num1,num2,ch;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        num1=sc.nextInt();
        System.out.println("Enter 2nd no:");
        num2=sc.nextInt();
        System.out.println("Enter your choice here :> 1-Addition 2-Subtraction 3-Multiplication 4-Division \n Enter your choice:");
        ch=sc.nextInt();
        sc.close();
    }

    void putdata(){
        if(ch==1){
            System.out.println("Addition of num1 & num2:"+(num1+num2));
        }
        else if(ch==2){
            System.out.println("Subtraction of num1 & num2:"+(num1-num2));
        }
        else if(ch==3){
            System.out.println("Multiplication of num1 & num2:"+(num1*num2));
        }
        else if(ch==4){
            System.out.println("Division of num1 & num2 :"+(num1/num2));
        }
        else{
            System.out.println("Invalid choice");
        }
    }

    public static void main(String[] args) {
        Calculator obj= new Calculator();
        obj.getdata();
        obj.putdata();
    }

}
