//Use String::toUpperCase to convert strings to uppercase.
package Java8.MethodReference;

import java.util.function.Function;

public class StringToUpperCase {
    public static void main(String[] args) {

        Function<String, String> obj = String::toUpperCase;

        System.out.println(obj.apply("java"));
    }
}