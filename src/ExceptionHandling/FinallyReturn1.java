package ExceptionHandling;

public class FinallyReturn1 {
    static int test(){
        try{
            return 10;
        }
        finally{
            return 20;
        }
    }

    public static void main(String[] args) {
        FinallyReturn1 obj = new FinallyReturn1();
        System.out.println(obj.test());
    }
}
