package WhileLoop;
import java.util.Scanner;

public class ReverseOfNumber {
    int num,rev=0;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to find its reverse:");
        num=sc.nextInt();
    }

    void putdata(){
        while(num>0){
            rev=rev*10+(num%10);
            num=num/10;
        }
        System.out.println("Reverse of a given no:"+rev);
    }

    public static void main(String[] args) {
        ReverseOfNumber obj= new ReverseOfNumber();
        obj.getdata();
        obj.putdata();
    }
}
