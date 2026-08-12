package ForLoop.Patterns;
import java.util.Scanner;

public class DownwardStars1 {
    int n;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no of rows:");
        n = sc.nextInt();
    }
    void putdata(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DownwardStars1 obj = new DownwardStars1();
        obj.getdata();
        obj.putdata();
    }
}
