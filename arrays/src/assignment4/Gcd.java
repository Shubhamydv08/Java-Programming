package assignment4;

public class Gcd {
    public static void main(String[] args) {
        System.out.println(gcd(10,20));
    }
    static int gcd(int n , int m) {
        if(n==0) {
            return m;
        }
        return gcd(m%n,n);
    }
}
