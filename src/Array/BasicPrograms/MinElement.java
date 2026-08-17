package Array.BasicPrograms;

public class MinElement {
    int[] arr={20,10,30,50,40};

    void min(){
        int min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Minimum element of an array:"+min);
    }

    public static void main(String[] args) {
        MinElement obj = new MinElement();
        obj.min();
    }
}
