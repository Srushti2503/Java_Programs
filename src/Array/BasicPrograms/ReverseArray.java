package Array.BasicPrograms;
import java.util.Scanner;

public class ReverseArray {
    int[] arr;
    int size;

    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        arr=new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element to store in an array:");
            arr[i]=sc.nextInt();
        }
    }

    void show(){
        System.out.println("Array before reversing elements:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    void reverse(){
        System.out.println("Array after reversing elements:");
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.getdata();
        obj.show();
        obj.reverse();
    }
}
