package ForLoop.Patterns;
import java.util.Scanner;

public class RhombusPattern {
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
            System.out.print("_"+" ");
        }
        for(int k=1;k<=n;k++){
            System.out.print("*"+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        RhombusPattern obj = new RhombusPattern();
        obj.getdata();
        obj.putdata();
    }
}

