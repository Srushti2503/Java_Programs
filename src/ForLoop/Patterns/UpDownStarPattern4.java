package ForLoop.Patterns;
import java.util.Scanner;

public class UpDownStarPattern4 {
    int n;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter max no of rows:");
        n=sc.nextInt();
        sc.close();
    }

    void putdata(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("_"+" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(i+k-1+" ");
            }
            System.out.println();
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("_"+" ");
            }
            for(int k=1;k<=2*(n-i)-1;k++){
                System.out.print(n-i+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        UpDownStarPattern4 obj = new UpDownStarPattern4();
        obj.getdata();
        obj.putdata();
    }
}
