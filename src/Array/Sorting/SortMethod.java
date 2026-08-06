package Array.Sorting;
import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        String [] cities ={"Mumbai","Pune","Nashik","Nagar","Delhi"};
        System.out.println("Original Order of elements of array:");
        for(int i=0;i<cities.length;i++){
            System.out.println(i+" "+ cities[i]);
        }
        Arrays.sort(cities);
        System.out.println("New order of elements of array:");
        for(int j=0;j<cities.length;j++){
            System.out.println(j+" "+ cities[j]);
        }

    }
}
