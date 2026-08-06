package Constructor;

public class ParameterizedCons {

    ParameterizedCons(){
        System.out.println("No argument constructor....");
    }

    ParameterizedCons(int m){
        System.out.println("One Argument Constructor....");
    }
    ParameterizedCons(int a,String b){
        System.out.println("Two Arguments Constructor....");
    }

    static void main(String[] args) {
        ParameterizedCons aa = new ParameterizedCons();
        ParameterizedCons bb= new ParameterizedCons(50);
        ParameterizedCons cc= new ParameterizedCons(30,"Srushti");
}
}
