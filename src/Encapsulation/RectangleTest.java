package Encapsulation;


class Rectangle{
    private int length,breadth;

    //constructor...
    Rectangle(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    //getter
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }

    //setter...
    public void setLength(int length){
        this.length=length;
    }

    public void setBreadth(int Breadth){
        this.breadth=breadth;
    }

}
public class RectangleTest {
    static void main(String[] args) {
        Rectangle r1= new Rectangle(10,5);

        int lth = r1.getLength();
        int bth = r1.getBreadth();

        int area=lth*bth;
        System.out.println("Area of rectangle:"+area);

        r1.setLength(15);
        r1.setBreadth(5);

        int ln = r1.getLength();
        int br = r1.getBreadth();
        int newArea = ln * br;
        System.out.println("New area: " +newArea);
    }
}
