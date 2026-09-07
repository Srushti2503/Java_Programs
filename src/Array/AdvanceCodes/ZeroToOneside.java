package Array.AdvanceCodes;
import java.util.Scanner;

public class ZeroToOneside {

int[] arr;
int size;

void getdata(){
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the size of the array:");
    size=sc.nextInt();

    //array initialization...
    arr=new int[size];

    //array input..
    for(int i=0;i<arr.length;i++){
        System.out.println("Enter element to store in an array:");
        arr[i]=sc.nextInt();
    }
}

void putdata(){

    //to display array.....
    System.out.println("Array before rearranging:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();


    //to move zeros to one side..
    int index=0;

    for(int i=0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[index]=arr[i];
            index++;
        }
    }

    while(index<arr.length){
        arr[index]=0;
        index++;
    }

    System.out.println("Array after moving zeros to one side:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
}

    public static void main(String[] args) {
        ZeroToOneside obj = new ZeroToOneside();
        obj.getdata();
        obj.putdata();
    }
}
