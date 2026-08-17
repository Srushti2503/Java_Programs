//take an array & print all unique elements of array.......

package Array.BasicPrograms;
import java.util.Scanner;

public class UniqueElements {
    int[] arr;
    int size;

    void getdata(){
        Scanner sc = new Scanner(System.in);

        //to get size of an array...
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        //array creation......
        arr=new int[size];

        //array input...
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element to add in an array:");
            arr[i]=sc.nextInt();
        }
    }

    void putdata(){
        System.out.println("Elements of an array:");

        //to display array elements.....
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        // to find unique elements.....
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println("Unique element:"+arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        UniqueElements obj = new UniqueElements();
        obj.getdata();
        obj.putdata();
    }
}
