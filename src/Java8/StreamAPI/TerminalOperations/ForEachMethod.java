//Print all elements of a List using forEach()
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class ForEachMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        list.stream().forEach(System.out::println);
    }
}