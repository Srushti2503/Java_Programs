//Split multiple sentences into individual words (flatMap())
package Java8.StreamAPI;
import java.util.*;
import java.util.Arrays;

public class FlatMapEg {
    public static void main(String[] args) {

        List<String> sentences = Arrays.asList(
                "Java is powerful",
                "Java is popular",
                "I love programming"
        );

        sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(System.out::println);
    }
}