//Use System.out::println to print all elements of a List.

package Java8.MethodReference;
import java.util.*;

public class DisplayListElements {
    public static void main(String[] args) {


        List<Integer>list=Arrays.asList(10,20,30,40);

        list.forEach(System.out::println);

    }
}
