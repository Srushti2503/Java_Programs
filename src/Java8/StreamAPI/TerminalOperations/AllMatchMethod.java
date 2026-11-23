//Check whether all numbers are positive using allMatch()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class AllMatchMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        boolean result = list.stream()
                .allMatch(n -> n > 0);

        System.out.println(result);
    }
}
