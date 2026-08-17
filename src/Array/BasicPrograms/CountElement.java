package Array.BasicPrograms;
import java.util.Scanner;

public class CountElement {
   int[] arr;
   int size,num,count=0;

   void getdata(){
       Scanner sc = new Scanner(System.in);

       //user defined size of an array..
       System.out.println("Enter size of an array:");
       size=sc.nextInt();

       //array initialization
       arr=new int[size];

       //array input..
       for(int i=0;i<arr.length;i++){
           System.out.println("Enter element:");
           arr[i]=sc.nextInt();
       }

       System.out.println("Enter no whose count you want to find:");
       num = sc.nextInt();
   }

   void putdata(){
       for(int i=0;i<arr.length;i++){
           if(arr[i]==num){
               count++;
           }
       }
       System.out.println(num+" is present "+ count +" times");
   }

    public static void main(String[] args) {
        CountElement obj = new CountElement();
        obj.getdata();
        obj.putdata();
    }
}
