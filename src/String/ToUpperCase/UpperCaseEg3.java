package String.ToUpperCase;
import java.util.Locale;

public class UpperCaseEg3 {
    public static void main(String[] args) {
        String s=new String("Country");

        // Converting all charaters of string into uppercase letters.
        String german = s.toUpperCase(Locale.forLanguageTag("gr"));
        String english = s.toUpperCase(Locale.forLanguageTag("en"));

        System.out.println("String after UpperCase method in german:"+german);
        System.out.println("String after UpperCase method in english:"+english);

    }
}
