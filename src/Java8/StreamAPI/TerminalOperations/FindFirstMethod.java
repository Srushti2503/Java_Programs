//Find the first number greater than 20 using findFirst()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class FindFirstMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 15, 25, 30, 40);

        Optional<Integer> result = list.stream()
                .filter(n -> n > 20)
                .findFirst();

        System.out.println(result.orElse(-1));
    }
}