//create two arrays by taking input from user and merge this 2 arrays using 3rd array......

package Array.BasicPrograms;
import java.util.Scanner;

public class MergeArrays {
int[] arr1,arr2;
int[] arr3;
int size1,size2;

void getdata(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of 1st array:");
    size1=sc.nextInt();
    arr1= new int[size1];
    System.out.println("Enter size of 2nd array:");
    size2=sc.nextInt();
    arr2= new int[size2];


    //input to 1st array...
    for(int i=0;i<arr1.length;i++){
        System.out.println("Enter element to add in 1st  array:");
        arr1[i]=sc.nextInt();
    }

    //input to 2nd array.....
    for(int i=0;i<arr2.length;i++){
        System.out.println("Enter ellement to add in 2nd array:");
        arr2[i]=sc.nextInt();
    }
}

void show(){

    //to print 1st array.....
    System.out.println("Elements of 1st array:");
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
    }
    System.out.println();

    System.out.println("Elements of 2nd array:");

    //to print 2nd array...
    for(int i=0;i<arr2.length;i++){
        System.out.print(arr2[i]+" ");
    }

    System.out.println();
}

void logic(){
    arr3= new int[arr1.length+arr2.length];
    //to add elements of 1st array in 3rd array......
    for(int i=0;i<arr1.length;i++){
        arr3[i]=arr1[i];
    }

    //to add elements of 2nd array to 3rd array......

    for(int i=0;i<arr2.length;i++){
        arr3[arr1.length+i]= arr2[i];
    }

    System.out.println("Elements of 3rd array:");
    //to print third array.......
    for(int i=0;i<arr3.length;i++){
        System.out.print(arr3[i]+" ");
    }
}

    public static void main(String[] args) {
        MergeArrays obj = new MergeArrays();
        obj.getdata();
        obj.show();
        obj.logic();
    }
}