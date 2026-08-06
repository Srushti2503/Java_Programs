package Exercise1;
import java.util.Scanner;

public class PositiveNegative {

    int num;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check:");
        num = sc.nextInt();
        sc.close();
    }
    void putdata(){
        if(num>0){
            System.out.println("Positive number");
        }
        else if (num<0){
            System.out.println("Negative number.");
        }
        else{
            System.out.println("Zero");
        }
    }

    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative();
        obj.getdata();
        obj.putdata();
    }
}
