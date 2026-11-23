//Check whether any number is negative using anyMatch()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class AnyMatchMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, -5, 30, 40);

        boolean result = list.stream()
                .anyMatch(n -> n < 0);

        System.out.println(result);
    }
}