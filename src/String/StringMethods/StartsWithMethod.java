package String.StringMethods;

public class StartsWithMethod {
    public static void main(String[] args) {

        String s="Java Programming";
        System.out.println(s.startsWith("Java"));

        //with offset
        System.out.println(s.startsWith("Pro", 5));
    }

}
