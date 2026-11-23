package ExceptionHandling;

public class UnhandledExceptionAndFinally {
    public static void main(String[] args) {

        try{
            int x=10/0;
        }
        finally{
            System.out.println("Finally Block.");
        }
        System.out.println("After Finally Block.");
    }
}
