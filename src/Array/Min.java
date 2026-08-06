package Array;

public class Min {
    int[] array={30,20,10};

    void show(){
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println("Min value :"+min);
    }

    public static void main(String[] args) {
        Min obj= new Min();
        obj.show();
    }


}
