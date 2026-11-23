//Generate five random numbers using Stream.generate()
package Java8.StreamAPI;
import java.util.stream.Stream;
import java.util.Random;

public class StreamGenerateMethod {
    public static void main(String[] args) {

        Random random = new Random();

        Stream.generate(() -> random.nextInt(100))
                .limit(5)
                .forEach(System.out::println);
    }
}