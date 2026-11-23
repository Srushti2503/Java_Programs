package ObjectClass;

public class EqualsMethodCaseInsensitive {

    // Working equalsIgnoreCase() Method

        public static void main(String[] args)
        {
            // Define three strings
            String str1 = "Hello";
            String str2 = "hello";
            String str3 = "WORLD";


            // Comparison between str1 and str2
            System.out.println("str1.equals(str2): "+ str1.equals(str2));

            // Comparison between str1 and str2(Case Insensitive)
            System.out.println("str1.equalsIgnoreCase(str2): "+ str1.equalsIgnoreCase(str2));

            // Comparison between str2 and str3
            System.out.println("str2.equalsIgnoreCase(str3): "+ str2.equalsIgnoreCase(str3));
        }

}
