package Array;
import java.util.Scanner;

public class ProductOfArray {
    int[] array;
    int size,prod=1;

    void getdata(){
        Scanner sc = new Scanner(System.in);

        //taking size of an array from user.....
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        array=new int[size];

        //array elements input....
        for(int i=0;i<size;i++){
            System.out.println("Enter element to store in an array:");
            array[i]=sc.nextInt();
        }
    }
    void show(){
        for(int i=0;i<size;i++){
            System.out.println("Element at "+array[i]+" position:"+array[i]);
        }
        System.out.println();
    }
    void product(){
        for(int i=0;i<size;i++){
            prod=prod*array[i];
        }
        System.out.println("Product of elements of an array:"+prod);
    }

    public static void main(String [] args){
        ProductOfArray obj = new ProductOfArray();
        obj.getdata();
        obj.show();
        obj.product();
    }
}
