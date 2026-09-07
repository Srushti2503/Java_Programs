package Array.AdvanceCodes;
import java.util.Scanner;

public class SecondLargestNo {
int[] arr;
int size;

void getdata(){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter size of an array:");
    size=sc.nextInt();

    arr= new int[size];

    for(int i=0;i<arr.length;i++){
        System.out.println("Enter element to store in array:");
        arr[i]=sc.nextInt();
    }
    sc.close();
}

void putdata(){
    System.out.println("Array elements:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();


    int largest = arr[0];
    int secondLargest = arr[0];

    for (int i = 1; i < arr.length; i++) {

        if (arr[i] > largest) {
            secondLargest = largest;
            largest = arr[i];
        }
        else if (arr[i] > secondLargest && arr[i] != largest) {
            secondLargest = arr[i];
        }
    }

    System.out.println("Second largest element: " + secondLargest);

}

    public static void main(String[] args) {
        SecondLargestNo obj = new SecondLargestNo();
        obj.getdata();
        obj.putdata();
    }
}
