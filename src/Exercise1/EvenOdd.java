package Exercise1;
import java.util.Scanner;

public class EvenOdd {
    int num;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        num = sc.nextInt();
    }
    void putdata(){
        if(num%2==0){
            System.out.println("Even number.");
        }
        else{
            System.out.println("Odd number.");
        }
    }

    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.getdata();
        obj.putdata();
    }
}
