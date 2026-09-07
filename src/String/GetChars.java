package String;

public class GetChars {
    public static void main(String[] args) {
        StringBuffer sb= new StringBuffer("Java Programming.");
        System.out.println("Content of original StringBuffer:"+sb);

        char[] c= new char[9];
        sb.getChars(0,9,c,0);
        System.out.println("Content of character StringArray:");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }
}
