//Sort Strings according to their length (sorted())
package Java8.StreamAPI;
import java.util.*;

public class SortedInLength {
    public static void main(String[] args) {

        List<String> names =
                Arrays.asList("Srushti", "Amit", "Pranav", "Riya");

        names.stream()
                .sorted(Comparator.comparingInt(String::length))
                .forEach(System.out::println);
    }
}