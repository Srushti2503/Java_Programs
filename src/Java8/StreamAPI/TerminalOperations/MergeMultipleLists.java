//Merge multiple Lists using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeMultipleLists {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 30);
        List<Integer> list2 = Arrays.asList(40, 50, 60);
        List<Integer> list3 = Arrays.asList(70, 80, 90);

        List<Integer> result = Stream.of(list1, list2, list3)
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Merged List: " + result);
    }
}