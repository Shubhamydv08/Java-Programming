package assignment4;

import java.util.HashSet;
import java.util.Set;

public class Q4 {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6};
        missing(a);

    }
    static void missing(int a[]) {
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            s.add(a[i]);
        }
        for (int j = 1; j < a.length+1; j++) {
            while (!s.contains(j)) {
                System.out.println(j);
                break;
            }
        }

    }
}
