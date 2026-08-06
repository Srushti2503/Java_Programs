package Encapsulation;

class Number{
    private int y;

    public int getNumber(){
        return y;
    }

    public void setNumber(int y){
        this.y=y;
    }
    void display(){
        System.out.println("Value of Y:"+y);
    }
}
public class EncapTest {
    static void main(String[] args) {
        Number n= new Number();
        n.setNumber(6);
        n.display();
    }
}




