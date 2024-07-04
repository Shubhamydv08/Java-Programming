import java.util.Arrays;
import java.util.Scanner;

public class A1 {
    public static void main(String[] args) {
        // arrays of premitives
        // Declration of An Array
        int [] arr = {55,60,70,80,90};
        System.out.println(arr[3]);
        // Declaration using loop
        Scanner sc = new Scanner(System.in );
        int[] arr1 = new int [5] ;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for(int ans: arr1) { // for every element of array print the element (for each loop)
            System.out.print(ans + "  ");// here ans represents elements of the array
        }
      //  System.out.println(Arrays.toString(arr1)); // used for printing the array without using loop



        // Array of object
        String [] str = new String[6];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }
        System.out.println(Arrays.toString(str));
    }
}
