package String.ToLowerCase;

public class LowerCaseEg2 {
    public static void main(String[] args) {
     String str="This String Is A Combination Of Digit 08 And Symbol @";
     String s= str.toLowerCase();          //digits and special characters are not affected by using lowercase
        System.out.println("Original String:"+str);
        System.out.println("String after using LowerCase method:"+s);
    }
}
