package Array.AdvanceCodes;
import java.util.Scanner;

public class NegativeToOneSide {
int[] arr;
int size;

void getdata(){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the size of the array");
    size=sc.nextInt();

    //array initialization...
    arr= new int[size];

    //array input.....
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter element to store in array:");
        arr[i]=sc.nextInt();
    }
    sc.close();

}

void putdata(){
    //to display array......
    System.out.println("Array before rearranging:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    int left=0;
    int right=arr.length-1;

    while(left<right){


        while(left<right && arr[left]<0){
            left++;
        }


        while(left<right && arr[right]>0){
            right--;
        }

        if(left<right ){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }
    System.out.println("array after rearranging:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

}

    public static void main(String[] args) {
        NegativeToOneSide obj=new NegativeToOneSide();
        obj.getdata();
        obj.putdata();
    }
}
