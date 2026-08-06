package ThisKeyword;

public class Test {
    int a = 10;

    static int b = 20;

    Test(){
        this.a=100;
        System.out.println(a);

        this.b=200;
        System.out.println(b);
    }

    static void main(String[] args) {
        Test aa= new Test();

    }
}
