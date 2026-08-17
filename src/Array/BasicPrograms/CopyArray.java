package Array.BasicPrograms;

public class CopyArray {
int[] arr1={10,20,30,40,50};
int[] arr2=new int[arr1.length];


void copy(){
    //to print original array......
    System.out.println("original array elements:");
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr1[i]+" ");
    }
    System.out.println();

    for(int i=0;i<arr1.length;i++){
        arr2[i]=arr1[i];
    }

    System.out.println("copy array elements:");
    for(int i=0;i<arr1.length;i++){
        System.out.print(arr2[i]+" ");
    }
}

    public static void main(String[] args) {
        CopyArray obj = new CopyArray();
        obj.copy();
    }
}
