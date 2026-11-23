//Check whether no number is zero using noneMatch()

package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class NoneMatchMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        boolean result = list.stream()
                .noneMatch(n -> n == 0);

        System.out.println(result);
    }
}