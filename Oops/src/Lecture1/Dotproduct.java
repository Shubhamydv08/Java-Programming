package Lecture1;
import java.util.Arrays;
import java.util.Scanner;
public class Dotproduct {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
            System.out.println(Arrays.toString(a));
        int b[] = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(b));
        int c[] = new int[n];
        for (int i = 0; i <n ; i++) {
            c[i] =a[i]*b[i];
        }
        System.out.println(Arrays.toString(c));



    }

}
