package Static;

public class StaticBlockEg {
    {
        System.out.println("Instance Block 1 executed...");
    }
    {
        System.out.println("Instance block 2 executed...");
    }
    static{
        System.out.println("Static block 1 executed...");
    }
    static
    {
        System.out.println("Static block 2 executed...");
    }

    StaticBlockEg(){
        System.out.println("0-Argument Constructor...");
    }

    StaticBlockEg(int a){
        System.out.println("1-Argument Constructor...");
    }

    static void main(String[] args) {
        StaticBlockEg eg= new StaticBlockEg();
        StaticBlockEg e= new StaticBlockEg(10);

    }

}
