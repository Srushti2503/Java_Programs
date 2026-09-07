package String.ReverseString;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReverseMethodOfCollection {

        public static void main(String[] args) {

            String s = "Hello World";

            // Convert String into character array
            char[] ch = s.toCharArray();

            // Create a List of Character
            List<Character> list = new ArrayList<>();

            // Add each character into the list
            for (char c : ch) {
                list.add(c);
            }

            // Reverse the list
            Collections.reverse(list);

            // Create Iterator to traverse the list
            Iterator<Character> li = list.iterator();

            // Print characters one by one
            while (li.hasNext()) {
                System.out.print(li.next());
            }
        }
    }

