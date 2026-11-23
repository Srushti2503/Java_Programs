package ExceptionHandling;

public class FinallyReturn {
    static int show(){
        try{
            return 10;
        }
        finally{
            System.out.println("Finally block.");
        }
    }

    public static void main(String[] args) {
        FinallyReturn obj = new FinallyReturn();
        System.out.println(  obj.show());
    }
}
