package Array.BasicPrograms;
import java.util.Scanner;


public class FrequencyOfNo {

    int[] arr;
    int size,key,count=0;

    Scanner sc = new Scanner(System.in);

    void getdata(){
        System.out.println("Enter size of an array:");
        size=sc.nextInt();

        arr= new int[size];

        //array input......
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter element to store in an array:");
            arr[i]=sc.nextInt();
        }


    }

    void putdata(){
        //to display array.....
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.println("Enter element to find its frequency:");
        key=sc.nextInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                count++;
            }
        }
        System.out.println("Frequency of a given number:"+count);
    }

    public static void main(String[] args) {
        FrequencyOfNo obj = new FrequencyOfNo();
        obj.getdata();
        obj.putdata();
    }
}
