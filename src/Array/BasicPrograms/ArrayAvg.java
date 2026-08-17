package Array.BasicPrograms;
import java.util.Scanner;

public class ArrayAvg {
    int[] a;
    int size,sum=0,avg;

    void getdata(){
        Scanner sc = new Scanner(System.in);

        //taking size of an array from user...
        System.out.println("Enter size  of an array:");
        size=sc.nextInt();

        a=new int[size];
        //user input array elements...
        for(int i=0;i<a.length;i++){
            System.out.println("Enter element to store in array:");
            a[i]=sc.nextInt();

        }

        //array elements printing....
        for(int i=0;i<a.length;i++){
            System.out.println("Element at "+i+" Position:"+a[i]);
        }
    }

    void putdata(){
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        avg=sum/a.length;
        System.out.println("Average of array:"+avg);
    }

    public static void main(String[] args) {
        ArrayAvg obj = new ArrayAvg();
        obj.getdata();
        obj.putdata();
    }
}
