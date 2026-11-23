//Find common elements between two Lists using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;
import java.util.stream.Collectors;

public class CommonElements {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(10, 20, 30, 40, 50);

        List<Integer> list2 = Arrays.asList(30, 40, 50, 60, 70);

        List<Integer> result = list1.stream()
                .filter(list2::contains)
                .collect(Collectors.toList());

        System.out.println("Common Elements: " + result);
    }
}