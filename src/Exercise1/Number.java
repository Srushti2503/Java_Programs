package Exercise1;
import java.util.Scanner;

public class Number {
    int num1,num2;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        num2 = sc.nextInt();
        sc.close();
    }

    void putdata(){
        if(num1>num2){
            System.out.println("Bigger number:"+num1);
        }
        else{
            System.out.println("Biger number:"+num2);
        }
    }

    public static void main(String[] args) {
        Number n= new Number();
        n.getdata();
        n.putdata();
    }
}
