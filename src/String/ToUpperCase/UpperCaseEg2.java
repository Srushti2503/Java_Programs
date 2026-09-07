package String.ToUpperCase;

public class UpperCaseEg2 {
    public static void main(String[] args) {
        String s= new String("Science");
        System.out.println("Original String:"+s);

        String s2="Science";

        String s3=s.toUpperCase();
        System.out.println(s==s2);
        System.out.println(s.equals(s2));

        System.out.println(s.equalsIgnoreCase(s2));
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));


    }
}
