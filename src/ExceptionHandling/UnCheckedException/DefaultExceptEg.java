package ExceptionHandling.UnCheckedException;

public class DefaultExceptEg {
    int x=20;
    int y=0;
    void divide(){
        System.out.println("I am in divide method.");
    try{
        System.out.println("I am in try block.");
        int z=x/y;
        System.out.println("Result:"+z);
    }
    catch(NullPointerException e){
        System.out.println("I am in catch method.");
    }
    }
    public static void main(String[] args) {
        DefaultExceptEg obj = new DefaultExceptEg();
        System.out.println("I am in main method.");
        obj.divide();
    }
}
