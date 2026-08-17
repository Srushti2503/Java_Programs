package Array.Sorting;
import java.util.Scanner;


public class BubbleSort {

    int[] arr;
    int size,temp;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        //array initialization.....
        arr= new int[size];

        //array input....
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element to store:");
            arr[i]=sc.nextInt();
        }
        sc.close();

        //to display array...
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    void putdata(){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j + 1]) {
                  temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;

                }
            }
        }

        System.out.println("Array elements after sorting:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        obj.getdata();
        obj.putdata();
    }
}
