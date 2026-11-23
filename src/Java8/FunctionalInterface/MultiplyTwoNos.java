//Create a BiFunction to calculate the multiplication of two numbers.
package Java8.FunctionalInterface;
import java.util.function.BiFunction;

public class MultiplyTwoNos {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer>obj=(a,b)->a*b;

        System.out.println(obj.apply(10,2));
        System.out.println(obj.apply(2,4));
    }
}
