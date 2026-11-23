//Create a Stream from an ArrayList and print all elements (stream())

package Java8.StreamAPI;

import java.util.*;

public class ArrayPrinting {
    public static void main(String[] args) {

        ArrayList<Integer> list =
                new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        list.stream()
                .forEach(System.out::println);
    }
}