//Convert a List into a Map using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {

    public static void main(String[] args) {

        List<String> list = Arrays.asList(
                "Java", "Python", "SQL", "Spring"
        );

        Map<String, Integer> result = list.stream()
                .collect(Collectors.toMap(
                        str -> str,
                        str -> str.length()
                ));

        System.out.println(result);
    }
}