package String.ReverseString;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class ReverseWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your string:");
        String str = sc.nextLine();

        Stack<Object> st = new Stack<Object>();

        StringTokenizer sTok = new StringTokenizer(str);

        while (sTok.hasMoreTokens()) {
            st.push(sTok.nextElement());
        }

        StringBuffer sb = new StringBuffer();

        while (!st.empty()) {
            sb.append(st.pop());
            sb.append(" ");
        }

        System.out.println("Reversed string: " + sb);
    }
}
