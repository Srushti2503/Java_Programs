package ForLoop.Patterns;
import java.util.Scanner;

public class DownStarsWithSpace2 {
int n;

void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter max no of rows:");
    n=sc.nextInt();
}

void putdata(){
    for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
            System.out.print("_"+" ");
        }
        for(int k=1;k<=n+1-i;k++){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        DownStarsWithSpace2 obj = new DownStarsWithSpace2();
        obj.getdata();
        obj.putdata();
    }
}
