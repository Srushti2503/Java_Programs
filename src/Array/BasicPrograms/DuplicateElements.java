package Array.BasicPrograms;
import java.util.Scanner;

public class DuplicateElements {
int[] arr;
int size;

void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of an array:");
    size=sc.nextInt();

    //array creation..
    arr= new int[size];

    //array input....
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter element to add in array:");
        arr[i]=sc.nextInt();
    }
}

void putdata(){
    //to display array.....
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    //to find duplicates....
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                System.out.println("Duplicate:"+arr[i]);
                break;
            }
        }
    }
}

    public static void main(String[] args) {
        DuplicateElements obj = new DuplicateElements();
        obj.getdata();
        obj.putdata();
    }
}
