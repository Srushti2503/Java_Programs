package Array.BasicPrograms;

public class MaxElement {
    int[] arr={10,20,30,40,50};

    void max(){
        int max=arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element of array:"+max);
    }

    public static void main(String[] args) {
        MaxElement obj = new MaxElement();
        obj.max();
    }
}
