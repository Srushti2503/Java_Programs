package String.CharAt;

public class FreqOfChar {
    public static void main(String[] args) {
        String str="I Love My Country";

        int s=str.length();
        System.out.println("Original String length:"+s);
        int count=0;
        for(int i=0;i<s;i++){
            if(str.charAt(i)=='o'){
                count++;
            }
        }
        System.out.println("O is present:"+ count +" times");
    }
}
