package Java8.FunctionalInterface;
import java.util.function.BiConsumer;

public class BiConsumerToPrintName {
    public static void main(String[] args) {

        BiConsumer<String,Integer>obj=(name,marks)->{
            System.out.println("Student name:"+name);
            System.out.println("Student marks:"+marks);
        };
        obj.accept("Rahul",20);
    }
}
