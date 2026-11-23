//Print the first 10 natural numbers using Stream.iterate()

package Java8.StreamAPI;

import java.util.stream.Stream;

public class StreamIterateMethod {
    public static void main(String[] args) {

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(System.out::println);
    }
}