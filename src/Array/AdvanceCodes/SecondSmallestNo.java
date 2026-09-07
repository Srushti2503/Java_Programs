package Array.AdvanceCodes;
import java.util.Scanner;

public class SecondSmallestNo  {

        int[] arr;
        int size;

        void getdata() {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter size of an array:");
            size = sc.nextInt();

            arr = new int[size];

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element:");
                arr[i] = sc.nextInt();
            }
        }

        void putdata() {

            int smallest;
            int secondSmallest;

            if (arr[0] < arr[1]) {
                smallest = arr[0];
                secondSmallest = arr[1];
            } else {
                smallest = arr[1];
                secondSmallest = arr[0];
            }

            for (int i = 2; i < arr.length; i++) {

                if (arr[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = arr[i];
                }
                else if (arr[i] < secondSmallest && arr[i] != smallest) {
                    secondSmallest = arr[i];
                }
            }

            System.out.println("Second smallest element: " + secondSmallest);
        }

        public static void main(String[] args) {

            SecondSmallestNo obj = new SecondSmallestNo();

            obj.getdata();
            obj.putdata();
        }
    }