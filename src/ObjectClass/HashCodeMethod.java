package ObjectClass;
import java.lang.reflect.Method;

public class HashCodeMethod {
    public void getSampleMethod() {}

        public static void main(String[] args) {

            try {
                Class<?> c = HashCodeMethod.class;

                Method method =
                        c.getDeclaredMethod("getSampleMethod");

                int hashCode = method.hashCode();

                System.out.println(
                        "hashCode of method "
                                + method.getName()
                                + " is "
                                + hashCode);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }

}

//Explanation: In this example, the getDeclaredMethod() method is used to obtain the Method object representing
// getSampleMethod(). The hashCode() method is then called on this Method object to retrieve its hash code value.
// Finally, the program prints the method name along with its corresponding hash code.
