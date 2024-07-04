package assignment2;

import java.util.Scanner;
import java.util.ArrayList;

public class Q1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(50);
//        list.add(50);
//        list.add(50);
//        list.add(50);
//        list.add(50);
//        if(!list.isEmpty()) {

            System.out.println("enter the size of the arraylist :");
            int n = sc.nextInt();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            System.out.println(list);
            System.out.println("Enter the no. you want to search :");
            int s = sc.nextInt();
            if (list.contains(s)) {
                System.out.println("element is present");
            } else {
                System.out.println("element is not present");
            }
            System.out.println("Enter the position u want to remove :");
            int k = sc.nextInt();
            list.remove(k);
            System.out.println(list);
        }


    }



