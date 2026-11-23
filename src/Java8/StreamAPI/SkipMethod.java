//Skip the first two elements and print the remaining elements (skip())

package Java8.StreamAPI;
import java.util.*;

public class SkipMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        list.stream()
                .skip(2)
                .forEach(System.out::println);
    }
}