package Inheritance;

class BaseClasss{
    private int x=10;
    public int y=20;
    protected int z=30;


    private void show(){
        System.out.println("Private method of parent class..");
    }

    public void showData(){
        System.out.println("Public method of parent class..");
    }

    protected void display(){
        System.out.println("Protected method of parent class..");
    }

    void input(){
        System.out.println("Parent class method...");
    }
    static void putdata(){
        System.out.println("static method of parent class..");
    }
}

class DeriveClass extends BaseClasss{
    DeriveClass(){
        super.input();
    }
    void input(){
        System.out.println("Child class method...");
    }
}

public class MainClass {
    static void main(String[] args) {
       //parent class object...

        BaseClasss obj= new BaseClasss();
        System.out.println("Public variable of parent class:"+obj.y);
        System.out.println("Protected variable of parent class:"+obj.z);
        obj.display();
        obj.showData();
        obj.input();
        BaseClasss.putdata();
        System.out.println();

        //derived class object..

        DeriveClass dc= new DeriveClass();
        dc.showData();
        dc.display();
        dc.input();
        BaseClasss.putdata();
        System.out.println("Public variable of parent class:"+dc.y);
        System.out.println("Protected variable of parent class:"+dc.z);
    }
}
