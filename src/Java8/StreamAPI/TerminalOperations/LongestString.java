//Find the longest String from a List using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;
import java.util.stream.*;

public class LongestString {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java", "Python", "SpringBoot", "Hibernate", "SQL"
        );

        String result = list.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);

        System.out.println("Longest String: " + result);
    }
}