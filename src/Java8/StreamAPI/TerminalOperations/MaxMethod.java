//Find the maximum number from a List using max()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class MaxMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(50, 10, 40, 20, 30);

        Optional<Integer> max = list.stream()
                .max(Comparator.naturalOrder());

        System.out.println("Maximum = " + max.get());
    }
}