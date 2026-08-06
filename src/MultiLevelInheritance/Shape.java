package MultiLevelInheritance;

/*Create class Shape → Rectangle → Box
Calculate area and volume.

 */

import java.util.Scanner;

public class Shape {
    int len,bred,height,area,volume;
    void getdata(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of rect:");
        len=sc.nextInt();
        System.out.println("Enter bredth of rect:");
        bred=sc.nextInt();
        System.out.println("Enter height of rect:");
        height=sc.nextInt();
    }

    public static void main(String[] args) {
        Box aa= new Box();
        aa.getdata();
        aa.showdata();
        aa.display();
    }

}
class Rectangle extends Shape {

    void showdata(){
        System.out.println("Length of rectangle:"+len);
        System.out.println("Bredth of rectangle:"+bred);
    }
}
class Box extends Rectangle {
    void display(){
        area=len*bred;
        System.out.println("Area of box"+area);

        volume=len*bred*height;
        System.out.println("Volume of box:"+volume);
    }
}
