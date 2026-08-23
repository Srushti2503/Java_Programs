package ForLoop.Patterns;
import java.util.Scanner;

public class HollowSquare{

    int n;

    void getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows:");
        n=sc.nextInt();
        sc.close();
    }
    void putdata(){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HollowSquare obj = new HollowSquare();
        obj.getdata();
        obj.putdata();
    }
}

