package ForLoop;
import java.util.Scanner;

public class Factorial {
    int num,fact=1;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no:");
        num=sc.nextInt();
    }
    void putdata(){
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of a given number:"+fact);
    }

    static void main(String[] args) {
        Factorial f=new Factorial();
        f.getdata();
        f.putdata();
    }

}
