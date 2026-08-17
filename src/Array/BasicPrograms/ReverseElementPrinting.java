package Array.BasicPrograms;

public class ReverseElementPrinting {
 int[] a= new int[]{10,20,30,40,50};

 void getdata(){
     for(int i=a.length-1;i>=0;i--){
         System.out.print(a[i]+" ");
     }
 }

    public static void main(String[] args) {
        new ReverseElementPrinting().getdata();
    }
}
