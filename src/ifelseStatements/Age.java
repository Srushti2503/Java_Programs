package ifelseStatements;
import java.util.Scanner;

public class Age {
    int age;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        age=sc.nextInt();
    }

    void putdata(){
        if(age<0){
            System.out.println("Invalid Age...");
        }
        else if(age>=0 && age<18){
            System.out.println("child..");
        }
        else if(age>=18 && age<60){
            System.out.println("Adult..");
        }
        else{
            System.out.println("Senior citizen...");
        }
    }

    static void main(String[] args) {
       Age a= new Age();
        a.getdata();
        a.putdata();
    }
}

