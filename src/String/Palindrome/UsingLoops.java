package String.Palindrome;
import java.util.Scanner;

public class UsingLoops {
    public static void main(String[] args) {

        String str;
        String s="";

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        str=sc.nextLine();

        int len=str.length();

        for(int i=len-1;i>=0;i--){
            s=s + str.charAt(i);
        }
        if(s.equalsIgnoreCase(str)){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
