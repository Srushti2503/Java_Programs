package String.CharAt;

public class CharAtEg4 {
    public static void main(String[] args) {
        String str= new String("I Love Java Programming");

        int s= str.length();
        System.out.println("Original String length:"+s);

        char ch1=str.charAt(0);
        System.out.println("First character of String:"+ch1);

        char ch2= str.charAt(s-1);
        System.out.println("Last character in String:"+ch2);
    }
}
