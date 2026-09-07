package ExceptionHandling.CustomException;

class OwnException extends Exception{
    OwnException(){

    }
}
public class MyClass {
    public static void main(String[] args) {
        try{
            OwnException obj = new OwnException();
            throw obj;
        }
        catch(OwnException e){
            System.out.println("Caught user defined exception");
        }
    }

}
