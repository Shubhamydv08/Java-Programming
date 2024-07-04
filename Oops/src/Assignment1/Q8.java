package Assignment1;
import java.util.Arrays;
import java.util.Scanner;
public class Q8 {
    static int [] dotProductArray(int a[], int b[] ,int n) {
       int z []= new int [n];
        for (int i = 0; i <n ; i++) {
            z[i]=a[i]*b[i];
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n = sc.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i = 0; i <n ; i++) {
             x[i] = sc.nextInt();
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + "  ");

        }
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }
        for (int i = 0; i <y.length ; i++) {
            System.out.print(y[i] + "  ");

        }
        System.out.println();
        int z[] = dotProductArray(x,y,n);
        for (int i = 0; i <n ; i++) {
            System.out.print("[ " + z[i] + "]" );

        }
    }
}
