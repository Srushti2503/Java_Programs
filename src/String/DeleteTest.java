package String;

public class DeleteTest {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("I Like Java");
        sb.delete(0,7);
        System.out.println(sb);
    }
}
