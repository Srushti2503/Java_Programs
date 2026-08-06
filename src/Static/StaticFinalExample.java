package Static;

public class StaticFinalExample {
    String name;
    int id;
    static final String companyname="IBM";
    StaticFinalExample(String name,int id){
        this.name=name;
        this.id=id;

    }
    void display(){
        System.out.println("Name :"+name +" "+"ID:"+id+" "+"Company Name :"+companyname);
    }

    static void main(String[] args) {
        new StaticFinalExample("srushti",10).display();
    }
}
