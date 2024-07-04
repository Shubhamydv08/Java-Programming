package practice;

import java.util.HashMap;
import java.util.HashSet;

public class Duplicate {
    public static void main(String[] args) {
        int arr[] ={1,1,2,2,3,4,4,4,5,5,6} ;
        //duplicate(arr);
        //odddup(arr);
        int ans = firstdup(arr);
        System.out.println(ans);

    }
    static void duplicate(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else
                map.put(arr[i], map.get(arr[i])+1);

        }
        for (int k : map.keySet()) {
            if (map.get(k)>1) {
                System.out.println(k);
            }
        }
    }
    static void odddup(int arr[]) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length ; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i],1);
            }else
                map.put(arr[i], map.get(arr[i])+1);
        }
        for(int k :map.keySet()) {
            if (map.get(k) %2 == 0) {
                System.out.println(k);
            }
        }
    }
    static int firstdup (int arr[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length ; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            }else
                return arr[i];
        }
        return -1;
    }
}
