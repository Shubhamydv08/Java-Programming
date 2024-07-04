package assignment4;

import java.util.HashSet;

public class Q1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,1,2,3};
        System.out.println(firstdup(a));
    }
    static int firstdup(int a[]) {
        HashSet<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(s.contains(a[i])) {
                return a[i] ;
            } else {
                s.add(a[i]);
            }
        }
        return -1;
    }

}
