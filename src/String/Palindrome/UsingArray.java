package String.Palindrome;
import java.util.Scanner;
public class UsingArray {

        // Create a function to check a sentence, phrase, or string is a palindrome or not.
        public static void isPalindrome(String str)
        {
            int i = 0;
            int len = str.length();
            // Convert the sentence into lowercase to make comparison case-insensitive.
            String s = str.toLowerCase();

            // Create an object of char array of size len for original string.
            char[] origCharArray = new char[len];
            // Create an object of char array of size len for reverse string.
            char[] revCharArray = new char[len];

            // Put the original string or sentence in an array of chars.
            for(i = 0; i < len; i++)
            {
                origCharArray[i] = s.charAt(i);
            }
            // Now, reverse array of chars.
            for(int j = 0; j < len; j++)
            {
                revCharArray[j] = origCharArray[len - 1 -j];
            }
            String revs = new String(revCharArray);
            if(str.equalsIgnoreCase(revs))
                System.out.println(revs+ " is a palindrome.");
            else
                System.out.println(revs+ " is not  palindrome.");
        }
        public static void main(String[] args)
        {
            // Create a Scanner class object.
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a sentence, phrase, or string: ");
            String s = sc.nextLine();
            isPalindrome(s);

        }
    }


