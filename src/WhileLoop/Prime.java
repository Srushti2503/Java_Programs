package WhileLoop;
import java.util.Scanner;

public class Prime {
    int num,count=0;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check whether it is prime or not:");
        num = sc.nextInt();
        sc.close();
    }

    void putdata(){
        int i=1;
        while(i<=num){
            if(num%i==0){
                count++;
            }
            i++;
        }
        if(count==2){
            System.out.println("Prime number.");
        }
        else{
            System.out.println("Not Prime Number.");
        }
    }

    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.getdata();
        obj.putdata();
    }
}
