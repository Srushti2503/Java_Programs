package ForLoop.Patterns;
import java.util.Scanner;

public class TriangleStarPattern {
int n;

void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of rows:");
    n=sc.nextInt();
    sc.close();
}

void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=i;j<n;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=i;k++){
            System.out.print("* ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        TriangleStarPattern obj = new TriangleStarPattern();
        obj.getdata();
        obj.putdata();
    }
}
