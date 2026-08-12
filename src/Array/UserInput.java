package Array;
import java.util.Scanner;

public class UserInput {
    int[] a;
    int size ;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        a=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter element of array:");
            a[i]=sc.nextInt();
        }
    }

    void putdata(){
        for(int i=0;i<size;i++){
            System.out.println("Element at "+a[i]+" Position:"+a[i]);
        }
    }

    public static void main(String[] args) {
        UserInput obj = new UserInput();
        obj.getdata();
        obj.putdata();
    }
}
