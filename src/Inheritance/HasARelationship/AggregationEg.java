package Inheritance.HasARelationship;

class Addres{
    String city;
    String state;

    //constructor....
    Addres(String city,String state){
        this.city=city;
        this.state=state;
    }
}

class Students{
    String name;
    Addres address;


    //constructor.......
    Students(String name, Addres address){
        this.name=name;
        this.address=address;
    }

    //method to display data...
    void display(){
        System.out.println("Name :"+name);
        System.out.println("City:"+address.city);
        System.out.println("State:"+address.state);
    }
}
public class AggregationEg {
    public static void main(String[] args) {
        Addres add= new Addres("Pune","Maharashtra");

        Students std=new Students("Srushti",add);
        std.display();
    }

}
