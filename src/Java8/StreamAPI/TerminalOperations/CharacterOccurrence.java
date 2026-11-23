//Count occurrences of each character in a String using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {

    public static void main(String[] args) {

        String str = "programming";

        Map<Character, Long> result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        LinkedHashMap::new,
                        Collectors.counting()
                ));

        result.forEach((key, value) ->
                System.out.println(key + " = " + value));
    }
}