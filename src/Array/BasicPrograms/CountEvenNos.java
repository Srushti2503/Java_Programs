package Array.BasicPrograms;

public class CountEvenNos {
    int[] arr={1,2,3,4,5,6,7,8,9,10};
    int count=0;

    void count(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("Total no of even numbers in array:"+count);
    }

    public static void main(String[] args) {
        CountEvenNos obj = new CountEvenNos();
        obj.count();
    }
}
