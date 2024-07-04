package Lecture1;
import java.util.Scanner;
public class A3q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first value");
        int m = sc.nextInt();
        System.out.println("Enter the second number");
        int n = sc.nextInt();
        int ans = gcd(m,n);
        System.out.println(ans);


    }
    public static int gcd (int m, int n) {
        if(Math.max(m,n)%Math.min(m,n) == 0)
            return Math.min(m,n);
        else
            return gcd(Math.max(m,n),Math.min(m,n))%Math.min(m,n);

    }
}
