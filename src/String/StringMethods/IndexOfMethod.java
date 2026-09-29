package String.StringMethods;

public class IndexOfMethod {
    public static void main(String[] args) {

        String s="Java Java Programming";

        System.out.println(s.indexOf("Java"));

        //with starting index
        System.out.println(s.indexOf("Java",3));

        //returns -1 if not present
        System.out.println(s.indexOf("Python"));
    }
}
