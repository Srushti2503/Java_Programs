package WhileLoop;
import java.util.Scanner;

public class Palindrome {
    int num,z,rev=0;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no to check whether it is palindrome or not:");
        num = sc.nextInt();
        z=num;
        sc.close();
    }

    void putdata(){
        while(z>0){
            rev=rev*10+(z%10);
            z=z/10;
        }

        if(rev==num){
            System.out.println("Palindrome number.");
        }
        else{
            System.out.println("Not Palindrome number.");
        }

    }

    public static void main(String[] args) {
        Palindrome obj = new Palindrome();
        obj.getdata();
        obj.putdata();
    }
}
