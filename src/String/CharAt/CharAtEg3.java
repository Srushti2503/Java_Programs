package String.CharAt;

public class CharAtEg3 {
    public static void main(String[] args) {
        String str=new String("Welcome To Scientech Easy");
        System.out.println("Original String:"+str);

        char[] c= new char[15];
        str.getChars(5,20,c,0);
        System.out.println("Content of char array:");
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]+" ");

        }
    }
}
