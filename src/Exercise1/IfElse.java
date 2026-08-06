package Exercise1;

public class IfElse {
    int i=5;
    void show(){
        if(i>=0){
            System.out.println("Positive number.");
        }
        else{
            System.out.println("Negative number.");
        }
    }

    public static void main(String[] args) {
        IfElse obj = new IfElse();
        obj.show();
    }
}
