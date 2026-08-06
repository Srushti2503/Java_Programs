package Exercise1;

class AB {
    public static void main(String[] args) {
        System.out.println("Inside A's main method");
    }
}

public class CD {
    public static void main(String[] args) {
        System.out.println("Inside B's main method");

        // Calling AB's main method
        AB.main(args);
    }
}
