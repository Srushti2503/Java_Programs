package Constructor;

public class ConsOverload {

    ConsOverload(){
        System.out.println("No-Argument Constructor...");
    }

    ConsOverload(String name){
        System.out.println("Parameterized Constructor ....");
        System.out.println(name);
    }

    static void main(String[] args) {
        ConsOverload ob = new ConsOverload(); //1st constructor will be called
        ConsOverload ob2 = new ConsOverload("Srushti");   //2nd constructor will be called
    }
}
