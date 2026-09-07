package String.CharAt;

public class EvenIndexChar {
    public static void main(String[] args) {
        String str= new String("I Love Java Programming");

        int s=str.length();
        System.out.println("Original String length:"+s);

        for(int i=0;i<s;i++){
            if(i%2==0){
                System.out.println("Char at "+ i+" Index "+ str.charAt(i));
            }
        }

    }
}
