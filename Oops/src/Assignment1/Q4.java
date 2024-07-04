package Assignment1;
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no. of lines");
        int n = sc.nextInt();
        String str [] = new String[n];
        System.out.println("enter the line");

       for(int i=0; i<n ;i++)
           str[i] = sc.nextLine();
            for (int i = n - 1; i >= 0; i++)
                System.out.println(str[i]);


    }

}
