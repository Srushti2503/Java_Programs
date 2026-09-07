package String.ReverseString;
import java.util.Scanner;

public class Recursion {

    public static String reverse(String str){
        int len=str.length();
        if(len==0){
            return "";
        }
        return str.charAt(len-1)+ reverse(str.substring(0, len-1));
    }

    public static void main(String[] args) {
        Recursion r= new Recursion();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();
        System.out.println("Reversed String:"+reverse(s));
    }

}
