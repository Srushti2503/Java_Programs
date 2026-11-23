//Create a Supplier to generate a random number.
package Java8.FunctionalInterface;
import java.util.Random;
import java.util.function.Supplier;

public class SupplierToGenerateNo {
    public static void main(String[] args) {


        Supplier<Integer>obj=()->new Random().nextInt(100);

        System.out.println(obj.get());
    }
}
