//Print only the first three elements (limit())

package Java8.StreamAPI;
import java.util.*;

public class LimitMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        list.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}