package WhileLoop;
import java.util.Scanner;

public class XtoPowerY {
    int x,y,z;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base:");
        x=sc.nextInt();
        System.out.println("Enter index:");
        y=sc.nextInt();
        z=y;
        sc.close();
    }

    void putdata(){
        int i =1,prod=1;
        while(y>0){
            prod=prod*x;
            y--;
        }
        System.out.println(x +" to the power "+ z +":"+ prod);
    }

    public static void main(String[] args) {
        XtoPowerY obj = new XtoPowerY();
        obj.getdata();
        obj.putdata();
    }
}
