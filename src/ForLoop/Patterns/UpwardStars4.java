package ForLoop.Patterns;
import java.util.Scanner;

public class UpwardStars4 {
    int n;

    void getdata(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no of rows:");
        n = sc.nextInt();
    }

    void putdata(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UpwardStars4 obj = new UpwardStars4();
        obj.getdata();
        obj.putdata();
    }

}
