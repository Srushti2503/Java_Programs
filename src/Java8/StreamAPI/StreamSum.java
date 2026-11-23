
//Create a Stream from an int array and calculate its sum (Arrays.stream())
package Java8.StreamAPI;

import java.util.Arrays;

public class StreamSum {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int sum = Arrays.stream(arr).sum();

        System.out.println("Sum = " + sum);
    }
}