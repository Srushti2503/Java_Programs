//Find all names whose length is greater than 5 (filter())
package Java8.StreamAPI;

import java.util.*;

public class FilterNames {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Srushti", "Amit", "Pranav", "Riya", "Shubham");

        names.stream()
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);
    }
}