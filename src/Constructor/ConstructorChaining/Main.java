package Constructor.ConstructorChaining;

class X{

    X(){
        System.out.println("No-Argument Constructor of X class...");
    }

    X(int x){
        System.out.println("Parameterised Constructor of X class..");
    }

}

class Y extends X{
    Y(){
        System.out.println("No-Argument Constructor of Y class...");
    }

    Y(int x){
        System.out.println("Parameterised cons of Y class...");
    }
    void show(){
        System.out.println("Y class method...");
    }
}
public class Main {
    public static void main(String[] args) {
//        Y obj= new Y();
//        obj.show();

        Y ob= new Y(10);
        ob.show();
    }
}
