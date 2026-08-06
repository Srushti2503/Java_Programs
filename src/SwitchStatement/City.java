package SwitchStatement;
import java.util.Scanner;

public class City {


    public static void main(String[] args) {
        String ch;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your city name:m->Mumbai d->Dhanbad c->Chennai r->ranchi ");
        ch =sc.next();

        switch(ch){
            case "m":
                System.out.println("Mumbai");
              break;

            case "d":
                  System.out.println("Dhanbad");
                  break;

            case "c":
                System.out.println("Chennai");
                break;

            case "r":
                System.out.println("Ranchi");
                break;

            default:
                System.out.println("No city");
        }

    }
}