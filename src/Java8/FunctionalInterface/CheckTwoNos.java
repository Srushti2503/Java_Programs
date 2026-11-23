//Create a BiPredicate to check whether two numbers are equal.
package Java8.FunctionalInterface;
import java.util.function.BiPredicate;

public class CheckTwoNos {
    public static void main(String[] args) {

        BiPredicate<Integer, Integer> obj = (a, b) -> a.equals(b);

        System.out.println(obj.test(10,2));
        System.out.println(obj.test(20,10));
    }
}
