package ForLoop.Patterns;
import java.util.Scanner;

public class ZeroOneTriangle {
int n;

void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter max rows:");
    n=sc.nextInt();
    sc.close();
}

void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
        if((i+j)%2==0){
            System.out.print("1");
        }
        else{
            System.out.print("0");
        }
        }
        System.out.println();
    }
}

    static void main(String[] args) {
        ZeroOneTriangle obj = new ZeroOneTriangle();
        obj.getdata();
        obj.putdata();
    }
}
