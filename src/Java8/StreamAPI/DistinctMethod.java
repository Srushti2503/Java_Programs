//Remove duplicate numbers from a List (distinct())

package Java8.StreamAPI;
import java.util.*;

public class DistinctMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 10, 30, 20, 40);

        list.stream()
                .distinct()
                .forEach(System.out::println);
    }
}