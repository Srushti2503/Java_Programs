package Encapsulation;

class Mensuration {
    private double l, b, r;

    //getter for each....

    public double getL() {
        return l;
    }

    public double getB() {
        return b;
    }

    public double getR() {
        return r;
    }


    //setters.........

    public void setL(double l) {
        this.l = l;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setR(double r) {
        this.r = r;
    }

    //methods.....
    public double areaRect() {
        double area = l * b;
        return area;
    }

    public double perimeter() {
        double perimeter = 2 * (l + b);
        return perimeter;
    }

    public double areac() {
        double area = 3.14 * r * r;
        return area;
    }

    public double perc() {
        double per = 2 * 3.14 * r;
        return per;
    }

}

public class MyTest {
    static void main(String[] args) {
        Mensuration aa= new Mensuration();
        aa.setL(20);
        aa.setB(10);
        aa.setR(5);
        aa.areaRect();


        double areaR=aa.areaRect();
       double perimeter= aa.perimeter();
        double areac =aa.areac();
        double per=aa.perc();


        System.out.println("Area of rectangle:"+areaR);
        System.out.println("Perimeter of rectangle:"+perimeter);
        System.out.println("Area of circle:"+areac);
        System.out.println("Perimeter of circle:"+per);
    }
}
