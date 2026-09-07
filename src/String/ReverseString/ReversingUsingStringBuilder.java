package String.ReverseString;
import java.util.Scanner;

public class ReversingUsingStringBuilder {
    public static void main(String[] args) {

        String str;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        str=sc.nextLine();

        int len=str.length();
        System.out.println("Length of original String:"+len);

        StringBuilder sb= new StringBuilder(str);
        sb.reverse();
        System.out.println("reversed String:"+sb);

    }
}
