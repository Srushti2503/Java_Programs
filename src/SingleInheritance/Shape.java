package SingleInheritance;

/*Create a class Shape with method area().
Create a class Circle that calculates area of circle.
 */

public class Shape {
    void area(){
        System.out.println("Area Calculation");
    }

    public static void main(String[] args) {
        Circle aa= new Circle();
        aa.area();
        aa.result();
    }
}
class Circle extends Shape {
    double rad=5,a;
    void result(){
        a=3.14*rad*rad;
        System.out.println("Area of circle->"+a);


    }
}

