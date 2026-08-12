package ForLoop.Patterns;
import java.util.Scanner;

public class IncreasingStarPattern1 {
int n;

void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max no of rows:");
    n=sc.nextInt();
}

void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print("_"+" ");
        }
        for(int k=1;k<=(2*i)-1;k++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        IncreasingStarPattern1 obj = new IncreasingStarPattern1();
        obj.getdata();
        obj.putdata();
    }
}
