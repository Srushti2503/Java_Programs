package Array.BasicPrograms;
import Continue.Sum;

import java.util.Scanner;

public class SumOfArray {
    int[] a= new int[5];
    int sum=0;

    void getdata(){
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            System.out.println("Enter value to store in array:");
            a[i]=sc.nextInt();
        }
    }

    void show(){
        for(int i=0;i<a.length;i++){
            System.out.println("Element at "+i+" position:"+ a[i]);
        }
    }

    void sum(){
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of elements of an array:"+sum);
    }

    public static void main(String[] args) {
        SumOfArray obj = new SumOfArray();
        obj.getdata();
        obj.show();
        obj.sum();
    }
}
