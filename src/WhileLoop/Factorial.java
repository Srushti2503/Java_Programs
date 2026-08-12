package WhileLoop;
import java.util.Scanner;

public class Factorial {
    int num,prod=1;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its factorial:");
        num = sc.nextInt();
    }

    void putdata(){
        int i =1;
        while(i<=num){
            prod=prod*i;
            i++;
        }
        System.out.println("Factorial of "+ num +" is "+ prod);

    }

    public static void main(String[] args) {
        Factorial obj = new Factorial();
        obj.getdata();
        obj.putdata();
    }
}
