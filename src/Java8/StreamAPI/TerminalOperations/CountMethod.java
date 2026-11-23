//Count numbers greater than 25 using count()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class CountMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        long count = list.stream()
                .filter(n -> n > 25)
                .count();

        System.out.println("Count = " + count);
    }
}