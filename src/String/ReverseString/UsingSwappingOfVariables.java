package String.ReverseString;

public class UsingSwappingOfVariables {
        public static void main(String[] args)
        {
            String s = "Scientech Easy";
            char[ ] temp = s.toCharArray();
            int i, j = 0;
            j = temp.length - 1;
            for (i = 0; i < j; i++, j--)
            {
                // Swapping values of i and j.
                char t = temp[i];
                temp[i] = temp[j];
                temp[j] = t;
            }
            for (i = 0; i < temp.length; i++) {
                System.out.print(temp[i]);
            }
            System.out.println();
        }


}
