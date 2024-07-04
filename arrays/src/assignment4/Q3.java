package assignment4;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,1,4,5,3));
        Set<Integer> set = new LinkedHashSet<>(list);
        list.clear();
        list.addAll(set);
        System.out.println(set);
    }
}
