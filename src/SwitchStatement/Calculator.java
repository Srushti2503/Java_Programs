package SwitchStatement;
import java.util.Scanner;

public class Calculator {
    int a, b, ch;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:");
        a = sc.nextInt();
        System.out.println("Enter 2nd no:");
        b = sc.nextInt();
        System.out.println("Enter your choice 1->Addition 2->Subtraction 3->multiplication 4->Division \n Enter your choice:");
        ch = sc.nextInt();
    }
    void putdata(){

        switch(ch) {
            case 1 : System.out.println("Addition :" + (a + b));
            break;
            case 2 :System.out.println("Subtraction :" + (a - b));
            break;
            case 3 :System.out.println("Multiplication :" + (a *b));
            break;
            case 4 :System.out.println("Division :" + (a /b));
            break;
            default:
                System.out.println("Invalid choice");
        }
    }

    static void main(String[] args) {
        Calculator c = new Calculator();
        c.getdata();
        c.putdata();
    }

}
