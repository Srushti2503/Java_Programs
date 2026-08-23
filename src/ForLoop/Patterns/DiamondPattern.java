package ForLoop.Patterns;
import java.util.Scanner;

public class DiamondPattern {
    int n;

    void getdata() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        n = sc.nextInt();

        sc.close();
    }

    void putdata() {

        // Upper half
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print("-"+" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* "+" ");
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = n; j > i; j--) {
                System.out.print("-"+" ");
            }

            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* "+" ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
       DiamondPattern obj = new DiamondPattern();

        obj.getdata();
        obj.putdata();
    }
}