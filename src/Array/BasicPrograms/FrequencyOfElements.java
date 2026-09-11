package Array.BasicPrograms;
import java.util.Scanner;


public class FrequencyOfElements {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter size:");
            int size = sc.nextInt();

            int[] arr = new int[size];
            boolean[] visited = new boolean[size];

            System.out.println("Enter elements:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            for (int i = 0; i < arr.length; i++) {

                if (visited[i])
                    continue;

                int count = 1;

                for (int j = i + 1; j < arr.length; j++) {

                    if (arr[i] == arr[j]) {
                        count++;
                        visited[j] = true;
                    }
                }

                System.out.println(arr[i] + " = " + count);
            }
        }
    }