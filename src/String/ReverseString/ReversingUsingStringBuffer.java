package String.ReverseString;
import java.util.Scanner;

public class ReversingUsingStringBuffer {
    public static void main(String[] args) {
     String str;

    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a String:");
    str=sc.nextLine();

    int len=str.length();
    System.out.println("Original String length:"+len);

    StringBuffer sb= new StringBuffer(str);
    sb.reverse();
    System.out.println("Reversed String:"+sb);
    }
}