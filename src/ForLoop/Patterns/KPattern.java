package ForLoop.Patterns;
import java.util.Scanner;

public class KPattern {
int n;
void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of rows:");
    n=sc.nextInt();
    sc.close();
}
void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n+1-i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
    for(int i=2;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        KPattern obj = new KPattern();
        obj.getdata();
        obj.putdata();
    }
}
