package Exercise1;
import java.util.Scanner;

public class Largest {
    int a,b,c;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        a=sc.nextInt();
        System.out.println("Enter 2nd no:");
        b=sc.nextInt();
        System.out.println("Enter 3rd no:");
        c=sc.nextInt();
    }
    void putdata(){
        int largest=a;
        if(b>largest){
            System.out.println("Largest:"+b);
        }
        if(c>largest){
            System.out.println("Largest:"+c);
        }
    }

    public static void main(String[] args) {
        Largest l = new Largest();
        l.getdata();
        l.putdata();
    }
}
