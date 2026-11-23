//Sort a list of Strings using String::compareToIgnoreCase.

package Java8.MethodReference;
import java.util.*;

public class SortingString {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("banana", "Apple", "mango", "Cherry");

        list.sort(String::compareToIgnoreCase);

        System.out.println(list);
    }
}