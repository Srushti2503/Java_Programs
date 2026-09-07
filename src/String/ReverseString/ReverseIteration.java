package String.ReverseString;

public class ReverseIteration {
    public static String ReverseString(String str){
        char[] ch=str.toCharArray();
        String reverse="";

        for(int i=ch.length-1;i>=0;i--){
            reverse= reverse+(ch[i]);

        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(ReverseString("Hello"));
        System.out.println(ReverseString("I like java programming"));
    }
}
