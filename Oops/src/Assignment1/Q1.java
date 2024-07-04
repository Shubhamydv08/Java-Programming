package Assignment1;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a = sc.nextInt(); int b = sc.nextInt(); int c =sc.nextInt();
        if (a+b==c || a==b-c || a*b==c) {
            System.out.println("correct Expression");
        } else {
            System.out.println("Incorrect Expression");
        }

    }
}
