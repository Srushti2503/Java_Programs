package Static;

public class Addition {
    int a=5;
    static int b=6;
    static int c=7;

    void show(){
        System.out.println("Value of A:"+a);
        System.out.println("Value of B:"+b);
        System.out.println("Value of C:"+c);
    }

    static void multiplication(){
        int mul = b*c;
        System.out.println("Value of multiplication ob b and c :"+mul);
    }

    static void main(String[] args) {

        //static method calling..........
        Addition.multiplication();

    }
}
