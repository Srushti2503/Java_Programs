package Array.Sorting;
import java.util.Scanner;

public class SelectionSort {
int size;
int[] arr;

void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array:");
    size=sc.nextInt();

    arr= new int[size];


    for(int i=0;i<arr.length;i++){
        System.out.println("Enter element to store in an array:");
        arr[i]=sc.nextInt();
    }

    System.out.println("Array elements before sorting:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

void putdata(){
    for(int i=0;i<arr.length-1;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    System.out.println("Array Elements after sorting:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

    public static void main(String[] args) {
        SelectionSort obj = new SelectionSort();
        obj.getdata();
        obj.putdata();
    }
}
