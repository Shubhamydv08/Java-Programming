import java.util.Scanner;

public class Q9A1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		//upper part
		for(int i=1; i<=n; i++) {
			//spaces
			int space = n-i;
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		//lower part
		for(int i=n; i>=1; i--) {
			//spaces
			int space = n-i;
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			//upper part
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		

	}

}
