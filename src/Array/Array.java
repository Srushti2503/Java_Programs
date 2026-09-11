package Array;

public class Array {
    public static void main(String[] args) {

        int[] arr1 ={10,20,30};

        System.out.println("Primitive array ->");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();


        String[] arr2 ={"Srushti","Aarush","Aarvi"};
        System.out.println("Non-primitive array->");
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
        System.out.println();
    }
}
