package MultiLevelInheritance;

/*Create class Food → Fruit → Mango
Add properties like taste, color, season.

 */

import java.util.Scanner;

public class Food {
    String fName,color,season;
    void input(){
        System.out.println("This class shows details of food");

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter name of fruit:");
        fName=sc.next();
        System.out.println("Enter color of fruit:");
        color=sc.next();
        System.out.println("Enter season of fruit:");
        season=sc.next();

    }

    public static void main(String[] args) {
        Mango aa= new Mango();
        aa.input();
        aa.show();
        aa.price();
    }


}
class Fruit extends Food {
    void show(){
        System.out.println("Name of fruit:"+fName);
        System.out.println("Color of fruit :"+color);
        System.out.println("Season of fruit:"+season);
    }
}
class Mango extends Fruit {
    int price=200;
    void price(){
        System.out.println("Price of mango:"+price);
    }
}

