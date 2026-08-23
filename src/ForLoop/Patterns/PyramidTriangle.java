package ForLoop.Patterns;
import java.util.Scanner;

public class PyramidTriangle {
int n;

void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter no of rows:");
    n=sc.nextInt();
    sc.close();
}

void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i;j++){
            System.out.print(" "+" ");
        }
        for(int k=i;k>=1;k--){
            System.out.print(k+" ");
        }
        for(int k=2;k<=i;k++){
            System.out.print(k+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        PyramidTriangle obj = new PyramidTriangle();
        obj.getdata();
        obj.putdata();
    }
}
