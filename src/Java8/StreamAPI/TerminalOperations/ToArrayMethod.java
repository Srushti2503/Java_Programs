//Convert a List into an Integer array using toArray()
package Java8.StreamAPI.TerminalOperations;

import java.util.*;
public class ToArrayMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        Integer[] arr = list.stream()
                .toArray(Integer[]::new);

        System.out.println(Arrays.toString(arr));
    }
}