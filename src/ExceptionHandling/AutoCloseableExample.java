package ExceptionHandling;

public class AutoCloseableExample implements AutoCloseable{

    public void start(){
        System.out.println("Resources started.");
    }
    @Override
    public void close() throws Exception {
        System.out.println("Resources closed.");
    }


    public static void main(String[] args) {
        try(AutoCloseableExample obj=new AutoCloseableExample()){
            obj.start();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
