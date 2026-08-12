package ForLoop.Patterns;
import java.util.Scanner;

public class UpStarsWithSpace2 {
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
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UpStarsWithSpace2 obj = new UpStarsWithSpace2();
        obj.getdata();
        obj.putdata();
    }
}
