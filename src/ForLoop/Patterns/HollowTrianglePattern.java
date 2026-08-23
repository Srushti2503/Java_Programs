package ForLoop.Patterns;
import java.util.Scanner;

public class HollowTrianglePattern {

        int n;

        void getdata() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter no of rows:");
            n = sc.nextInt();

            sc.close();
        }

        void putdata() {

            for (int i = 1; i <= n; i++) {

                // Spaces before stars
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }

                // Stars and inner spaces
                for (int j = 1; j <= 2 * i - 1; j++) {

                    if (j == 1 || j == 2 * i - 1 || i == n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }

        public static void main(String[] args) {
           HollowTrianglePattern obj = new HollowTrianglePattern();

            obj.getdata();
            obj.putdata();
        }

}


