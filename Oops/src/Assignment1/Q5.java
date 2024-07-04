package Assignment1;
import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        System.out.println(isOdd(n));
    }
    public static boolean isOdd(int n) {
       boolean odd = false;
       for (int j=0;j<n;j++){

           odd=!odd;
       }
        if (odd == true) {
            System.out.println("this is odd");
        } else {
            System.out.println("this is even");
        }
       return odd;

    }

}
