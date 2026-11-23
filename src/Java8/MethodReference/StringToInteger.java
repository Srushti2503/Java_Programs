//Use Integer::parseInt to convert a String into an Integer.

package Java8.MethodReference;
import java.util.function.Function;

public class StringToInteger {
    public static void main(String[] args) {

        Function<String, Integer> obj = Integer::parseInt;

        int num = obj.apply("100");

        System.out.println(num);
    }
}