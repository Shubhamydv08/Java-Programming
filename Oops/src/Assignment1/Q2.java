package Assignment1;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the positive integer greater than 2  ");
        int n = sc.nextInt();
        int i = 0;
        int c=0;
        while(i==n/2) {
            n=n/2;
            c++;
            if(n>2) break;
            i++;
        }
        if (c==0)
            System.out.println("not possible");
        else
            System.out.println(c);



    }
}
