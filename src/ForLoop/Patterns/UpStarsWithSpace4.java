package ForLoop.Patterns;
import java.util.Scanner;

public class UpStarsWithSpace4 {
    int n;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no of rows:");
        n = sc.nextInt();
    }

    void putdata(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("_"+" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(i+k+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UpStarsWithSpace4 obj = new UpStarsWithSpace4();
        obj.getdata();
        obj.putdata();
    }
}
