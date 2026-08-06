package Exercise1;

public class PreIncrement {
    int a=10;

    void show(){
        System.out.println("PreIncrement output:"+(++a));

    }

    public static void main(String[] args) {
        PreIncrement obj= new PreIncrement();
        obj.show();
    }
}
