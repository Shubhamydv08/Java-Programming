package assignment4;
import java.util.HashSet;
import java.util.Set;
public class Q5 {
    public static void main(String[] args) {
        int arr[] = {-2, 3, 0, 1, 10};
        int max = arr[0];
        int min = arr[0];
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            s.add(arr[i]);
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        for (int i = min; i < max; i++) {
            if (!s.contains(i)) {
                System.out.println(i);
            }


        }
    }
}
