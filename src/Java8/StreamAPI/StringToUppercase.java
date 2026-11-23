//Convert all Strings in a List to uppercase (map())
package Java8.StreamAPI;

import java.util.*;

public class StringToUppercase {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("java", "python", "spring");

        names.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}