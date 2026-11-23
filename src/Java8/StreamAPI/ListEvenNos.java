//Print all even numbers from a List (filter())

package Java8.StreamAPI;

import java.util.*;

public class ListEvenNos {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 15, 20, 25, 30, 35);

        list.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}