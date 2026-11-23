//. Find the second-lowest number in a List using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class SecondLowestNumber {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(50, 10, 30, 20, 40, 10);

        Integer result = list.stream()
                .distinct()
                .sorted()
                .skip(1)
                .findFirst()
                .orElse(null);

        System.out.println("Second Lowest Number: " + result);
    }
}