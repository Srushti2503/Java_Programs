package String.ToLowerCase;
import java.util.Locale;

public class LowerCaseEg3 {
    public static void main(String[] args) {
        String str= new String("I LIKE IT");
        System.out.println("Original String:"+str);

        // Create Locales with language "tr" for turkish and "en" for english.
        Locale turkish=Locale.forLanguageTag("Tr");
        Locale english= Locale.forLanguageTag("en");

        // Converting string str into lowercase letter using turkish and english languages.
        String toLowerCaseTr=str.toLowerCase(turkish);
        String toLowerCaseEng=str.toLowerCase(english);

        System.out.println("Lower Case letters in Turkish:"+toLowerCaseTr);
        System.out.println("Lower Case letters in English:"+toLowerCaseEng);


    }
}
