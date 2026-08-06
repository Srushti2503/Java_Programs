/*When a blank final variable is declared as static, but not initialized at a time of declaration,
 it can only be initialized in the static block. It cannot be initialized in the constructor of the class. */

package FinalKeyword;

public class FinalVar {
    final int x;
    final static int a;


    FinalVar(){
        x=10;
    }
    void display(){
        System.out.println("Value of X:"+x);
    }

    static{
        a=20;
        System.out.println("Value of A:"+a);
    }

    static void main(String[] args) {
        FinalVar aa= new FinalVar();
        aa.display();
    }


}
