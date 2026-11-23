//Find any even number using parallelStream() and findAny()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class FindAnyMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(11, 20, 30, 40, 50);

        Optional<Integer> result = list.parallelStream()
                .filter(n -> n % 2 == 0)
                .findAny();

        System.out.println(result.orElse(-1));
    }
}