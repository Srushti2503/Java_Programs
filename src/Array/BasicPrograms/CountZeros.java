package Array.BasicPrograms;

public class CountZeros {
    int[] arr={10,20,0,30,0,40,0,50,0};
    int count=0;

    void zeroCount(){

        for(int i=0;i<arr.length;i++){
                if(arr[i]==0){
                    System.out.println(arr[i]+" is at "+ i+ " Position");
                    count++;
                }
        }
        System.out.println("Total number of zeros in array:"+count);
    }

    public static void main(String[] args) {
        CountZeros obj = new CountZeros();
        obj.zeroCount();
    }
}
