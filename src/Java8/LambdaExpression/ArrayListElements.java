package Java8.LambdaExpression;
import java.util.ArrayList;

public class ArrayListElements {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.forEach(n-> System.out.println(n));
    }
}
