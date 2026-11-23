//Use peek() to display elements before and after map()

package Java8.StreamAPI;
import java.util.*;

public class PeekMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(1, 2, 3, 4, 5);

        list.stream()

                .peek(n -> System.out.println("Before map: " + n))

                .map(n -> n * n)

                .peek(n -> System.out.println("After map: " + n))

                .forEach(System.out::println);
    }
}