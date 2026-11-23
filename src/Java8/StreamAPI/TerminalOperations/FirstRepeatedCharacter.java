//Find the first repeated character in a String using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class FirstRepeatedCharacter {

    public static void main(String[] args) {

        String str = "programming";

        Set<Integer> set = new HashSet<>();

        Character result = str.chars()
                .filter(c -> !set.add(c))
                .mapToObj(c -> (char) c)
                .findFirst()
                .orElse(null);

        System.out.println("First repeated character: " + result);
    }
}