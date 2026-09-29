package String.StringMethods;

public class LinesMethod {
    public static void main(String[] args) {
        String s="Java\nPython\nSQL\nHTML\nCSS\nJS";
        s.lines().forEach(System.out::println);
    }

}
