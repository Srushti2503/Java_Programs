//Find numbers starting with 1 using Java 8 Stream API
package Java8.StreamAPI.TerminalOperations;
import java.util.*;

public class NumbersStartingWithOne {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(
                10, 15, 20, 100, 125, 30, 150, 45
        );

        list.stream()
                .map(String::valueOf)
                .filter(num -> num.startsWith("1"))
                .forEach(System.out::println);
    }
}