package loops;
import java.util.*;
public class Same {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] arr = new int[n] ;
        for(int i =0; i<arr.length ; i++)	{
        	arr[i] = sc.nextInt();
        	
        }
        System.out.println(Arrays.toString(arr));

	}

}
