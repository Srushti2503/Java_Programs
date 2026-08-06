package Constructor;

public class ConsOverload2 {


    ConsOverload2(){
        System.out.println("No argument constructor...");
    }

    ConsOverload2(String name){
        System.out.println("Name:"+name);
    }


    ConsOverload2(String name,int age){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }

    static void main(String[] args) {
        ConsOverload2 aa = new ConsOverload2();
        ConsOverload2 ab= new ConsOverload2("Srushti");
        ConsOverload2 ac = new ConsOverload2("Srushti", 22);

    }
}
