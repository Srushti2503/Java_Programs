package Array.Searching;
import java.util.Scanner;

public class LinearSearch {

    int[] arr;
    int size,flag=0,pos=-1,key;

    Scanner sc = new Scanner(System.in);

    void getdata(){
        //to take array size....
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        //array initialization....
        arr=new int[size];

        //array input........
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element to store in an array:");
            arr[i]=sc.nextInt();
        }
    }

    void putdata(){

        //To display Array......
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();

        //to get element that we want to search......
        System.out.println("Enter element that you want to search:");
        key=sc.nextInt();


        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                flag=1;
                pos=i+1;
            }
        }
        System.out.println("Element is found at: "+pos+" Position");

    }

    public static void main(String[] args) {
        LinearSearch obj = new LinearSearch();
        obj.getdata();
        obj.putdata();
    }

}
