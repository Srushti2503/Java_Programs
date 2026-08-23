package ForLoop.Patterns;

import java.util.Scanner;

public class NumberChangingPyramid {
    int n;

    void getdata(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter max no of rows:");
        n=sc.nextInt();
        sc.close();
    }
    void putdata(){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    static void main(String[] args) {
        NumberChangingPyramid obj = new NumberChangingPyramid();
        obj.getdata();
        obj.putdata();
    }
}
