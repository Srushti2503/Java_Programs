package ForLoop.Patterns;
import java.util.Scanner;

public class DownStarsWithSpace3 {
    int n;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no of rows:");
        n= sc.nextInt();
    }

    void putdata(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
                System.out.print("_"+" ");
            }
            for(int k=1;k<=n+1-i;k++){
                System.out.print(k+" ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        DownStarsWithSpace3 obj = new DownStarsWithSpace3();
        obj.getdata();
        obj.putdata();
    }
}
