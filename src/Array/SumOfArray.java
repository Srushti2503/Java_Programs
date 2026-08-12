package Array;
import java.util.Scanner;

public class SumOfArray {

    int[] a;
    int size,sum=0;

    void getdata(){
        Scanner sc = new Scanner(System.in);

        //array size declaration....
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        //array initialization...
        a=new int[size];

        //adding elements to array...
       for(int i=0;i<size;i++){
           System.out.println("Enter element to store in array:");
           a[i]=sc.nextInt();
       }
    }

    void putdata(){

        //to display all elements of array...
        for(int i=0;i<size;i++){
            System.out.println("Element at "+a[i]+" index:"+a[i]);
        }

        //to find sum of array......
        for(int i=0;i<size;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of elements of an array:"+sum);
    }

    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        obj.getdata();
        obj.putdata();
    }
}
