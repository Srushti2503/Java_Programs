package Array.BasicPrograms;

public class NegativeNos {
    int[] arr={-10,-20,-30,-40,-50,0,10,20,30,40};
    int count=0;

    void negativeNos(){

        for(int i=0;i<arr.length;i++){

            if(arr[i]<0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Total number of negative elements in an array:"+count);
    }

    public static void main(String[] args) {
        NegativeNos obj = new NegativeNos();
        obj.negativeNos();
    }
}
