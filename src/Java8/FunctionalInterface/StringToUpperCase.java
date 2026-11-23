package Java8.FunctionalInterface;
import java.util.function.Function;

public class StringToUpperCase {
    public static void main(String[] args) {


        Function<String , String>obj=str->str.toUpperCase();

        System.out.println(obj.apply("java"));
        System.out.println(obj.apply("HELLO"));
    }
}
