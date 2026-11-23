package Java8.FunctionalInterface;
import java.util.function.Predicate;

public class PredicateToCheckPositiveNegNo {

   public static void main(String[] args) {
        Predicate<Integer>obj=n->n>0;

        System.out.println(obj.test(10));
       System.out.println(obj.test(-20));

   }


}
