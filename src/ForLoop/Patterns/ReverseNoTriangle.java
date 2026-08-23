package ForLoop.Patterns;
import java.util.Scanner;

public class ReverseNoTriangle {
int n;

void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of rows:");
    n=sc.nextInt();
    sc.close();
}

void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=n+1-i;k++){
            System.out.print(i+k-1+" ");
        }
        System.out.println();
    }
}

   public static void main(String[] args) {
        ReverseNoTriangle obj = new ReverseNoTriangle();
        obj.getdata();
        obj.putdata();
    }
}
