package ExceptionHandling;

public class MultipleCatch {
    public static void main(String[] args) {
       try{
           int[] arr = {10, 20, 30};

           int x = arr[5];
           System.out.println(10 / 0);
       }
       catch(ArrayIndexOutOfBoundsException e){
           System.out.println("Invalid Index");
       }
       catch(ArithmeticException e){
           System.out.println("Cannot divide by zero");
       }

    }
}
