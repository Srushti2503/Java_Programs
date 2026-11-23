//Find the square of every number in a List (map())
package Java8.StreamAPI;
import java.util.*;

public class SqOfNo {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(2, 3, 4, 5);

        list.stream()
                .map(n -> n * n)
                .forEach(System.out::println);
    }
}