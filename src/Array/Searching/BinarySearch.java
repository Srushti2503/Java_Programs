package Array.Searching;
import java.util.Arrays;
import java.util.Scanner;


public class BinarySearch {

    int[] arr;
    int size,key,flag,high,low,pos;

    Scanner sc = new Scanner(System.in);

    void getdata(){
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        arr= new int[size];

        //array input..

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element to store in an array:");
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        //to display array.....
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void putdata(){
        System.out.println("Enter element you want to search:");
        key=sc.nextInt();

        low=0;
        high=arr.length-1;


       while(low<=high){
           int mid=low+(high-low)/2;
           if(key==arr[mid]){
               flag=1;
               pos=mid;
               break;
           }
           else if(key<arr[mid]){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
       }
       if(flag==1){
           System.out.println("Element found at "+ pos+" Position.");
       }
       else{
           System.out.println("Element not present..");
       }
    }

    public static void main(String[] args) {
        BinarySearch obj = new BinarySearch();
        obj.getdata();
        obj.putdata();
    }
}
