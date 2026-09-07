package String.Palindrome;

public class UsingReverseMethod {
    public static void main(String[] args) {
        String str="Madam";

        StringBuffer sb= new StringBuffer(str);
        String rev=sb.reverse().toString();

        if(rev.equalsIgnoreCase(str)){
            System.out.println("String "+ str+" is palindrome.");
        }
        else{
            System.out.println("String "+ str+ " is not Palindrome.");
        }
    }
}
