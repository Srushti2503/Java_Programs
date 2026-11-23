//Create a Stream using Stream.of() and print five numbers

package Java8.StreamAPI;

import java.util.stream.Stream;

public class StreamPrinting {
    public static void main(String[] args) {

        Stream.of(10, 20, 30, 40, 50)
                .forEach(System.out::println);
    }
}