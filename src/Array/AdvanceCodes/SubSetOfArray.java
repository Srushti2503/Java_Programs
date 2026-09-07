package Array.AdvanceCodes;

public class SubSetOfArray {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("{" + arr[j] + "}" + " ");
            }
            System.out.println();
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("{" + arr[j] + "} ");
            }
            System.out.println();
        }

        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 2; j <= arr.length - 1 - i; j++) {
                System.out.print("{" + arr[j] + "}" + " ");
            }
            System.out.println();
        }
    }
}