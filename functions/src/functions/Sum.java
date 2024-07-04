package functions;
import java.util.*;

public class Sum {

	public static void main(String[] args) {
		sum();
		sum();

	}
	static void sum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first no.");
		int num1 = sc.nextInt();
		System.out.print("Enter second no.");
		int num2 = sc.nextInt();
		int sum = num1 + num2;
		System.out.println("sum of two no.= "+sum);
	}

}
