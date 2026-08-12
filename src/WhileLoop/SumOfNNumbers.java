package WhileLoop;
import java.util.Scanner;

public class SumOfNNumbers {
int n,sum=0;

void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max no upto which you want to find sum:");
    n=sc.nextInt();
}

void putdata(){
    int i=1;
    while(i<=n){
        sum=sum+i;
        i=i+1;
    }
    System.out.println("Addition N number:"+sum);
}

    public static void main(String[] args) {
        SumOfNNumbers obj= new SumOfNNumbers();
        obj.getdata();
        obj.putdata();
    }

}
