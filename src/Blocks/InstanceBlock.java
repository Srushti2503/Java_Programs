package Blocks;

public class InstanceBlock {

    InstanceBlock(){
        System.out.println("Constructor of class..");
    }
    {
        System.out.println("This is Instance Block...");
    }

    static void main(String[] args) {
        new InstanceBlock();
    }
}
