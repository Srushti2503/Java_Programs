//Collect unique elements into a Set using collect()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;
import java.util.stream.Collectors;

public class CollectMethod1 {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 10, 30, 20, 40);

        Set<Integer> result = list.stream()
                .collect(Collectors.toSet());

        System.out.println(result);
    }
}