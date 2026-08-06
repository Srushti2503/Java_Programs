package Array;

public class Max {
    int[] array= {10,20,30};

    void show(){
        int max=array[0];

        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Max no:"+max);

    }

    public static void main(String[] args) {
        Max obj=new Max();
        obj.show();

    }
}
