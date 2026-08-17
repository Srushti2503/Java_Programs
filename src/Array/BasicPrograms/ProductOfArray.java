package Array.BasicPrograms;

public class ProductOfArray {
    int[] arr={1,2,3,4,5};
    int prod=1;

    void product(){

        for(int i=0;i<arr.length;i++){
            prod=prod*arr[i];
        }

        System.out.println("Product of elements of an array:"+prod);
    }

    public static void main(String[] args) {
        ProductOfArray obj = new ProductOfArray();
        obj.product();
    }
}
