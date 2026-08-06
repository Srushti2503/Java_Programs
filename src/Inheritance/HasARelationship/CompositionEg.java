package Inheritance.HasARelationship;

class Engine{
    String type;

    Engine(String type){
        this.type=type;
    }

    void start(){
        System.out.println(type+" Engine starts");
    }
}

class Car{
    String model;
    Engine engine;

    Car(String model,String engineType){
        this.model=model;
        this.engine=new Engine(engineType);
    }

    void display(){
        System.out.println("Car Model:"+model);
        engine.start();
    }
}


public class CompositionEg {
    public static void main(String[] args) {
        Car c= new Car("Toyoto","Petrol");
        c.display();
    }
}
