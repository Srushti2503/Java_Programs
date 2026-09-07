package ObjectClass;
import java.io.*;

public class GetClassMethod {

        public static void main(String[] args) {
            Writer writer = new PrintWriter(System.out);

            System.out.println(writer.getClass());
        }
}
