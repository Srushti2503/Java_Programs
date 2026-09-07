package String.CharAt;

public class CharAtEg2 {
    public static void main(String[] args) {
        String str= new String("Scientech Easy");
        System.out.println("Original String:"+str);

        char ch3= str.charAt(3);
        char ch5=str.charAt(5);
        char ch9=str.charAt(9);
        char ch13=str.charAt(13);


        System.out.println("Character at 3rd index:"+ch3);
        System.out.println("Character at 5th index:"+ch5);
        System.out.println("Character at 9th index:"+ch9);
        System.out.println("Character at 13th index:"+ch13);
    }
}
