//Q prints nos from 1-5 & 5-1...

package ForLoop;

public class Numbers {

    static void main(String[] args) {
        System.out.println("Printing numbers in same order....");
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }

        System.out.println("Printing nos in reverse order....");
        for(int i=5;i>=1;i--){
            System.out.println(i);
        }
    }
}
