//Find the longest String using reduce()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class ReduceMethod2 {
    public static void main(String[] args) {

        List<String> list =
                Arrays.asList("Java", "Python", "SpringBoot", "SQL");

        String longest = list.stream()
                .reduce((a, b) ->
                        a.length() > b.length() ? a : b)
                .orElse("");

        System.out.println("Longest String = " + longest);
    }
}