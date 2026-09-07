package String.ReverseString;
import java.util.Scanner;

public class CharAtMethod {
    public static void main(String[] args) {

        String s1,s2;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        s1=sc.nextLine();

        int s=s1.length();
        System.out.println("Original String length:"+s);

        for(int i=s-1;i>=0;i--){
            System.out.print(s1.charAt(i)+" ");
        }
    }
}
