package String.StringMethods;

public class EqualsIgnoreCase {
    public static void main(String[] args) {

        String s1="Java";
        String s2="JAVA";
        String s3="java";

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
