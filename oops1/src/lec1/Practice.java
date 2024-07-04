package lec1;
import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        //System.out.println(missingNumber(arr,n));
        //System.out.println(duplicates(arr,n));
        System.out.println(print2largest(arr, n));

    }

    public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        Arrays.sort(arr);
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                if (list.contains(arr[i])) {

                } else {
                    list.add(arr[i]);
                }
            }

        }
        if (list.size() == 0) {
            list.add(-1);
        } else {
            return list;
        }
        return list;

    }

//        static int missingNumber(int array[], int n) {
//            // Your Code Here
//            int n_sum = (n*(n+1))/2;
//            int sum=0;
//            for(int i=0;i< array.length;i++){
//                sum+=array[i];
//            }
//            return n_sum-sum;
//
//
//        }

    static int print2largest(int arr[], int n) {
        // code here
        int largest = Integer.MIN_VALUE;
        int seclargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (seclargest != largest) {
                if (arr[i] > seclargest) {
                    seclargest = arr[i];
                }
            }





        }
        return seclargest;

    }
}

