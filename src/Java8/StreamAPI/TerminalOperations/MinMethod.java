//Find the minimum number from a List using min()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class MinMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(50, 10, 40, 20, 30);

        Optional<Integer> min = list.stream()
                .min(Comparator.naturalOrder());

        System.out.println("Minimum = " + min.get());
    }
}