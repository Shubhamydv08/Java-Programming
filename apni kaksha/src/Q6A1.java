import java.util.*;
public class Q6A1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n; i++) {
			//spaces
			int spaces =n-i;
			for(int j=1; j<=spaces; j++) {
				System.out.print("  ");
			}
			//star
			for(int j=1; j<=5; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
