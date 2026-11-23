package Java8.FunctionalInterface;
import java.util.function.Function;

public class SquareOfNo {
    public static void main(String[] args) {


        Function<Integer , Integer>obj=n->n*n;
        System.out.println(obj.apply(5));
    }
}
