package Java8.FunctionalInterface;
import java.util.function.Predicate;

public class CheckStringEmptyOrNot {
    public static void main(String[] args) {


        Predicate<String>obj=str->str.isEmpty();

        System.out.println(obj.test(""));
        System.out.println(obj.test("Srushti"));
        System.out.println(obj.test(" "));
    }
}
