package assignment4;

import java.util.HashSet;

public class Q7 {
    public static void main(String[] args) {
        int arr[] ={1,2,2,3,3,3,4,4};
        odd(arr);
    }
    static void odd(int arr[]) {
        int i;
        int count;
        HashSet <Integer> a = new HashSet<>();
        for ( i = 0; i < arr.length; i++) {
            if(!a.contains(arr[i])) {
                a.add(arr[i]);
                count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                if (count % 2 != 0) {
                    System.out.println(arr[i]);
                }
            }

        }
            }



    }

