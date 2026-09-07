package String;

public class EnsureCapacity {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Hello");
        System.out.println("Before:"+sb.capacity());
        sb.ensureCapacity(40);
        System.out.println("After:"+sb.capacity());

    }
}
