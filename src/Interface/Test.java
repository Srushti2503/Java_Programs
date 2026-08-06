package Interface;

interface Printable{
    public abstract void print();
}

interface Showable{
    public abstract void show();
}
public class Test implements Printable,Showable{
    public void print(){
        System.out.println("Hello World");
    }
    public void show(){
        System.out.println("I am Srushti");
    }

   public  static void main(String[] args) {
        Test aa= new Test();
        aa.print();
        aa.show();

    }
}