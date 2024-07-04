package assignment4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Q12 {
    public static void main(String[] args) {
        ArrayList<Integer> x = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        ArrayList<Integer> y = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8,9));

        int value = 12;
        targetSumPair(x,y,value);

    }
    static void targetSumPair(ArrayList<Integer> x , ArrayList<Integer> y , int value) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i <x.size() ; i++) {
            set.add(x.get(i));
        }
        for (int i = 0; i < y.size(); i++) {
            if(set.contains(value-y.get(i))) {
                int xo = value-y.get(i);
                System.out.println(xo+ " " + y.get(i));
            }
        }
    }
}
