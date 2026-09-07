package String.Palindrome;
import java.util.Scanner;

public class UsingTwoVariables {

    public static boolean isPalindrome(String str){

        int i=0;
        int len=str.length();
        int j=len-1;

        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
                i++;
                j--;

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s=sc.nextLine();

        if(isPalindrome(s)){
            System.out.println("Palindrome.");
        }
        else{
            System.out.println("Not Palindrome.");
        }
    }
}
