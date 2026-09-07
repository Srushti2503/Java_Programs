package String;

public class CapacityTest {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer();
        System.out.println("Original String Length: "+sb.length());
        System.out.println("Original String Capacity: "+sb.capacity());

        sb.append("abcdefghijklmnop");      //string is appended
        System.out.println("String length after first append: "+sb.length());
        System.out.println("String capacity after 1st append: "+sb.capacity());

        sb.append("z");             //string is appended
        System.out.println("String length after second append: "+sb.length());
        System.out.println("String capacity after 2nd append: "+sb.capacity());
    }
}
