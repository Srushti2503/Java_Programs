package Array.BasicPrograms;

public class ElementSearch {
    int arr[]={10,20,30,40,50};
    int num=30;

    void search(){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println(arr[i]+ " is at "+ i+" Position");
            }
        }
    }

    public static void main(String[] args) {
        ElementSearch obj = new ElementSearch();
        obj.search();
    }
}
