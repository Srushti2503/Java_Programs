package ForLoop.Patterns;
import java.util.Scanner;

public class UpwardStars2 {
    int n;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        n = sc.nextInt();
    }

    void putdata(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UpwardStars2 obj = new UpwardStars2();
        obj.getdata();
        obj.putdata();
    }
}
