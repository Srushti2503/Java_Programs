package ForLoop.Patterns;
import java.util.Scanner;

public class ButterflyPattern {
int n;
void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of rows:");
    n=sc.nextInt();
    sc.close();
}

void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*"+" ");
        }
        for(int k=1;k<=2*(n-i);k++){
            System.out.print(" "+" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    //lower stars ...
    for(int i=1;i<n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("*"+" ");
        }
        //for spaces...
        for(int k=1;k<=2*i;k++){
            System.out.print(" "+" ");
        }
        //right stars..
        for(int k=1;k<=n-i;k++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        ButterflyPattern obj = new ButterflyPattern();
        obj.getdata();
        obj.putdata();
    }
}
