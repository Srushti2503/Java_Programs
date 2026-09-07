package String.CharAt;

public class CharAtEg1 {
    public static void main(String[] args) {
        String str= new String("Java Technology");
        System.out.println("Original String:"+str);


        char ch0=str.charAt(0);
        char ch4=str.charAt(4);
        char ch8= str.charAt(8);
        char ch9= str.charAt(9);


        System.out.println("Character at 0th index:"+ch0);
        System.out.println("Character at 4th index:"+ch4);
        System.out.println("Character at 8th index:"+ch8);
        System.out.println("Character at 9th index:"+ch9);

    }
}
