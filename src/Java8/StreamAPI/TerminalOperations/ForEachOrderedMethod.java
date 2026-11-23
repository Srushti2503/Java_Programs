//Print elements of a parallel Stream in encounter order using forEachOrdered()
package Java8.StreamAPI.TerminalOperations;

import java.util.*;
public class ForEachOrderedMethod {
    public static void main(String[] args) {

        List<Integer> list =
                Arrays.asList(10, 20, 30, 40, 50);

        list.parallelStream()
                .forEachOrdered(System.out::println);
    }
}
