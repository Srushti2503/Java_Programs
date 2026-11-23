package Java8.LambdaExpression;
import java.util.ArrayList;

public class SortingString {
    public static void main(String[] args) {

        ArrayList<String>list=new ArrayList<>();

        list.add("Apple");
        list.add("Papaya");
        list.add("Banana");
        list.add("Kivi");

        list.sort((s1,s2)->s1.compareTo(s2));
        System.out.println(list);
    }

}
