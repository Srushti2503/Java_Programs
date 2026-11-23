//Sort numbers in ascending and descending order (sorted())

package Java8.StreamAPI;
import java.util.*;

public class SortedInOrder {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(50, 10, 40, 20, 30);

        System.out.println("Ascending:");

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("Descending:");

        list.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);
    }
}