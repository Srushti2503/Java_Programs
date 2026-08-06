package Blocks;

public class Simple {

    Simple(){
        System.out.println("0-Argument Constructor...");
    }
    Simple(int m){
        System.out.println("1 Argument Constructor...");
    }

    Simple(int n , String o)
    {
        System.out.println("2 Argument Constructor...");
    }

    {
        System.out.println("Instance Block Used");
    }

    static void main(String[] args) {
        new Simple();
        new Simple(5);
        new Simple(7,"Srushti");

    }
}
