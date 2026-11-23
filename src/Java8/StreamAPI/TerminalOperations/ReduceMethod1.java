//Calculate the product of all numbers using reduce()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class ReduceMethod1 {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(2, 3, 4, 5);

        int product = list.stream()
                .reduce(1, (a, b) -> a * b);

        System.out.println("Product = " + product);
    }
}
