package loops;
import java.util.*;
public class Array1 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length of the array :");
		int n = sc.nextInt();
		String[] arr = new String[n];
		for (int i=0; i<arr.length;i++ ) {
			arr[i]= sc.next();
		}
		System.out.println(Arrays.toString(arr));
		arr[3]= "Shubham";
		System.out.println(Arrays.toString(arr));

	}

}
