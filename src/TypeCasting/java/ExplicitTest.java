package TypeCasting.java;

public class ExplicitTest {
    public static void main(String[] args) {
        byte b;
        int i=257;
        double d=323.142;

        System.out.println("Conversion of int to byte..");
        b=(byte)i;
        System.out.println("Value of i after converting into byte:"+i);

        System.out.println("Conversion of double to int");
        i=(int)d;
        System.out.println("Value of d after converting into int:"+d);

        System.out.println("Conversion of double to byte.");
        b=(byte)d;
        System.out.println("Value of d after converting into byte:"+d);
    }
}
