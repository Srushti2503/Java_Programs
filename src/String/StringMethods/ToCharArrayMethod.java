package String.StringMethods;

public class ToCharArrayMethod {
    public static void main(String[] args) {

        String s="Java";
        char[] ch=s.toCharArray();


        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }
}
