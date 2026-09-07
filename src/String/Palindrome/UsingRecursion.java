package String.Palindrome;
import java.util.Scanner;
public class UsingRecursion {
        // Create a function to check a string is a palindrome or not.
        public static boolean isPalindrome(String str)
        {
            // Checking for null value.
            if(str == null)
            {
                throw new IllegalArgumentException("String cannot be null");
            }
            // Find the length of a string.
            int len = str.length();
            // In case of empty string or one character string,
            // we do not need to do comparison because they are always palindromes.
            if(len <= 1)
            {
                return true;
            }
            // Convert the string into uppercase to make the comparison case-insensitive.
            String newStr = str.toUpperCase();

            // Get the first and last characters of a string.
            char first = newStr.charAt(0);
            char last = newStr.charAt(newStr.length() - 1);

            // Get the substring of this string.
            // The substring starts at the specified beginIndex and ends to the character at index endIndex - 1.
            String substring = newStr.substring(1, newStr.length() - 1);
            if(first == last)
            {
                return isPalindrome(substring); // Recursive case.
            }
            return false;
        }
        public static void main(String[] args)
        {
            // Create a Scanner class object to read input from keyboard.
            Scanner sc = new Scanner(System.in);
            // Prompt the user to enter a string.
            System.out.print("Enter the string: ");
            String str = sc.nextLine();

            // Condition to display palindrome message.
            if(isPalindrome(str))
            {
                System.out.println(str + " is a palindrome");
            }
            else {
                System.out.println(str + " is not a palindrome");
            }
        }


}
