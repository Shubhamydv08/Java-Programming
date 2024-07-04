import java.util.*;
public class ExerciseQ7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the base : ");
		
		int x = sc.nextInt();
		System.out.print("Enter the power : ");
		int n = sc.nextInt();
		
		double ans = Math.pow(x, n);
		System.out.println(ans);

	}

}
