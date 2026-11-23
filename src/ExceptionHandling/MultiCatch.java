package ExceptionHandling;

public class MultiCatch {
    public static void main(String[] args) {
        int[] arr={1,2,3};

        try{
            System.out.println(arr[5]);
        }
        catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println("Exception occured.");
        }
    }
}
