//Count occurrences of each word in a String using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;
import java.util.stream.Collectors;

public class WordOccurrence {

    public static void main(String[] args) {

        String str = "java is easy and java is powerful";

        Map<String, Long> result = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        result.forEach((key, value) ->
                System.out.println(key + " = " + value));
    }
}