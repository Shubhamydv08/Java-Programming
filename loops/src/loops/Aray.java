package loops;
import java.util.*;

public class Aray {

	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the size of the array");
	    int n= sc.nextInt();
		int[] arr= new int[n];
		//arr[0]= 71;
//		arr[1]=22;
//		arr[2]=13;
//		arr[3]=14;
//		arr[4]=15;
		//System.out.println(arr[2];
		for(int i =0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
		}

	}

}
