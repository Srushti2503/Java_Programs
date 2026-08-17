package Array.BasicPrograms;

public class CompareTwoArrays {
    int[] arr1={10,20,30,40,50};
    int[] arr2={10,20,30,40,50,};

    void result(){
        boolean result=true;

        if(arr1.length==arr2.length){

            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==arr2[i]){
                    result=true;
                }
                else{
                    result=false;
                }
            }

            if(result==true){
                System.out.println("Two arrays are Equal.");
            }
            else{
                System.out.println("Arrays are not equal.");
            }
        }
    }

    public static void main(String[] args) {
        CompareTwoArrays obj = new CompareTwoArrays();
        obj.result();
    }
}