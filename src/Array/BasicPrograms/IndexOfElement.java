package Array.BasicPrograms;

public class IndexOfElement {

    int[] arr={10,20,30,40,50};
    int num=30;

    void searchIndex(){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(num +" is present at "+ i+" index");
            }
        }
    }

    public static void main(String[] args) {
        IndexOfElement obj = new IndexOfElement();
        obj.searchIndex();
    }
}
