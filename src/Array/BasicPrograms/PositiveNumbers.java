package Array.BasicPrograms;

public class PositiveNumbers {
    int[] arr={-10,-20,-30,0,10,20,30,40};
    int count=0;

    void positiveNos(){
        for(int i=0;i<arr.length;i++){

            if(arr[i]>0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Total number of positive numbers in an array:"+count);
    }

    public static void main(String[] args) {
        PositiveNumbers obj = new PositiveNumbers();
        obj.positiveNos();
    }
}
