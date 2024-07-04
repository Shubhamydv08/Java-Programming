import java.util.Scanner;

public class Q8A1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			int spaces = n-i;
			for (int j=1; j<=spaces; j++) {
				System.out.print(" ");
			}
			//first part
			for(int j=i; j>=1; j--) {
				System.out.print(j);
			}
			//second part
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

	}

}
