package Java8.FunctionalInterface;
import java.util.function.Consumer;

public class ConsumerToPrintEmpDetails {
   public static void main(String[] args) {


       Consumer<String> obj = name -> System.out.println("Employee Name: " + name);

       obj.accept("Srushti");

   }
}
