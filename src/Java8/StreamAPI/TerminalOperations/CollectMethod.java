//Collect even numbers into a new List using collect()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;
import java.util.stream.Collectors;

public class CollectMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 15, 20, 25, 30, 35, 40);

        List<Integer> result = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}