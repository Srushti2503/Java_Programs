package Array.BasicPrograms;
import java.util.Scanner;

public class SwapArray {
int[] arr;
int size;

void getdata(){

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array:");
    size=sc.nextInt();

    arr= new int[size];


    for(int i=0;i<arr.length;i++){
        System.out.println("Enter element to store in array:");
        arr[i]=sc.nextInt();

    }
}

    void putdata(){
        System.out.println("Elements of array before swapping :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

//
        System.out.println("Elements of array after swapping:");
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        SwapArray obj = new SwapArray();
        obj.getdata();
        obj.putdata();
    }
}
